// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/Message.proto
// Protobuf Java Version: 4.27.3

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string method = 1;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <code>string method = 1;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <code>bytes payload = 2;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>int64 msg_id = 3;</code>
   * @return The msgId.
   */
  long getMsgId();

  /**
   * <code>int32 msg_type = 4;</code>
   * @return The msgType.
   */
  int getMsgType();

  /**
   * <code>int64 offset = 5;</code>
   * @return The offset.
   */
  long getOffset();

  /**
   * <code>bool need_wrds_store = 6;</code>
   * @return The needWrdsStore.
   */
  boolean getNeedWrdsStore();

  /**
   * <code>int64 wrds_version = 7;</code>
   * @return The wrdsVersion.
   */
  long getWrdsVersion();

  /**
   * <code>string wrds_sub_key = 8;</code>
   * @return The wrdsSubKey.
   */
  java.lang.String getWrdsSubKey();
  /**
   * <code>string wrds_sub_key = 8;</code>
   * @return The bytes for wrdsSubKey.
   */
  com.google.protobuf.ByteString
      getWrdsSubKeyBytes();
}
