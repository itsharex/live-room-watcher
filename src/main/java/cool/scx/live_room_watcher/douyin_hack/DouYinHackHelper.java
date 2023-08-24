package cool.scx.live_room_watcher.douyin_hack;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.protobuf.ByteString;
import cool.scx.live_room_watcher.douyin_hack.entity.DouYinApplication;
import cool.scx.live_room_watcher.douyin_hack.proto_entity.pushproto.PushFrame;
import cool.scx.live_room_watcher.douyin_hack.proto_entity.webcast.im.Response;
import cool.scx.util.ObjectUtils;
import cool.scx.util.URIBuilder;
import cool.scx.util.zip.GunzipBuilder;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.WebSocket;

import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static cool.scx.live_room_watcher.util.Navigator.navigator;

public  final class DouYinHackHelper {

    /**
     * 用来解析 RENDER_DATA
     */
    private static final Pattern RENDER_DATA_PATTERN = Pattern.compile("<script id=\"RENDER_DATA\" type=\"application/json\">(.*?)</script>");

    /**
     * 从 body 中解析出 liveRoomInfo
     *
     * @param htmlStr a
     * @return a
     * @throws com.fasterxml.jackson.core.JsonProcessingException a
     */
    public static DouYinApplication parseBody(String htmlStr) throws JsonProcessingException {
        var matcher = RENDER_DATA_PATTERN.matcher(htmlStr);
        if (matcher.find()) {
            var urlData = matcher.group(1);
            var jsonData = URLDecoder.decode(urlData, StandardCharsets.UTF_8);
            return ObjectUtils.jsonMapper().readValue(jsonData, DouYinApplication.class);
        }
        throw new RuntimeException("解析 RENDER_DATA 错误");
    }

    /**
     * 标准化 直播间 URI
     *
     * @param uri a {@link java.lang.String} object
     * @return a {@link java.lang.String} object
     */
    public static String initLiveRoomURI(String uri) {
        var liveRoomURI = URIBuilder.of(uri).removeAllParams().build();
        //检查是否为抖音直播间地址
        if (!"live.douyin.com".equals(liveRoomURI.getHost())) {
            throw new IllegalArgumentException("不是合法抖音直播间 url : " + uri);
        }
        //清理掉所有的多余路径
        return liveRoomURI.toString();
    }


    /**
     * 发送 ack
     *
     * @param webSocket a
     * @param pushFrame a
     * @param response  a
     */
    public static void sendAck(WebSocket webSocket, PushFrame pushFrame, Response response) {
        var ack = PushFrame.newBuilder()
                .setPayloadType("ack")
                .setLogid(pushFrame.getLogid())
                .setPayload(ByteString.copyFromUtf8(response.getInternalExt()))
                .build().toByteArray();
        webSocket.writeBinaryMessage(Buffer.buffer(ack));
    }

    /**
     * <p>getWebSocketURI.</p>
     *
     * @return a {@link java.net.URI} object
     */
    public static URI getWebSocketURI(String liveRoomID, boolean useGzip) {
        var internalExtMap = new LinkedHashMap<>();
        internalExtMap.put("internal_src", "dim");
        internalExtMap.put("wss_push_room_id", liveRoomID);
        internalExtMap.put("wss_push_did", "7184667748424615439");
        internalExtMap.put("dim_log_id", "2023011316221327ACACF0E44A2C0E8200");
        internalExtMap.put("fetch_time", "1673598133900");
        internalExtMap.put("seq", "1");
        internalExtMap.put("wss_info", "0-1673598133900-0-0");
        internalExtMap.put("wrds_kvs", "WebcastRoomRankMessage-1673597852921055645_WebcastRoomStatsMessage-1673598128993068211");

        var internalExt = internalExtMap.entrySet().stream().map(c -> c.getKey() + ":" + c.getValue()).collect(Collectors.joining("|"));

        var builder = URIBuilder.of("/webcast/im/push/v2/")
                .addParam("app_name", "douyin_web")
                .addParam("version_code", "180800")
                .addParam("webcast_sdk_version", "1.3.0")
                .addParam("update_version_code", "1.3.0")
                .addParam("internal_ext", internalExt)
                .addParam("cursor", "u-1_h-1_t-1672732684536_r-1_d-1")
                .addParam("host", "https://live.douyin.com")
                .addParam("aid", "6383")
                .addParam("live_id", "1")
                .addParam("did_rule", "3")
                .addParam("debug", "false")
                .addParam("endpoint", "live_pc")
                .addParam("support_wrds", "1")
                .addParam("im_path", "/webcast/im/fetch/")
                .addParam("device_platform", "web")
                .addParam("cookie_enabled", navigator().cookieEnabled())
                .addParam("screen_width", 1228)
                .addParam("screen_height", 691)
                .addParam("browser_language", navigator().language())
                .addParam("browser_platform", navigator().appCodeName())
                .addParam("browser_name", navigator().appCodeName())
                .addParam("browser_version", navigator().appVersion())
                .addParam("browser_online", navigator().onLine())
                .addParam("tz_name", "Asia/Shanghai")
                .addParam("identity", "audience")
                .addParam("room_id", liveRoomID)
                .addParam("heartbeatDuration", "0")
                //todo 这里抖音目前只校验是否为空 后期可能会校验具体值 届时需要逆向抖音加密规则
                .addParam("signature", "00000000");
        if (useGzip) {
            builder.addParam("compress", "gzip");
        }
        return builder.build();
    }


    /**
     * 处理 PushFrame 中的 gzip 压缩
     *
     * @param pushFrame a
     * @return a
     * @throws java.lang.Exception a
     */
    public static Response getResponse(PushFrame pushFrame) throws Exception {
        var gzip = pushFrame.getHeadersListList().stream().anyMatch(pushHeader -> "compress_type".equals(pushHeader.getKey()) && "gzip".equals(pushHeader.getValue()));
        var bytes = gzip ? new GunzipBuilder(pushFrame.getPayload().toByteArray()).toBytes() : pushFrame.getPayload().toByteArray();
        return Response.parseFrom(bytes);
    }

}