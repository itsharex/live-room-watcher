package cool.scx.live_room_watcher.douyin.type;

import cool.scx.live_room_watcher.Like;
import cool.scx.live_room_watcher.User;

public class LikeBody implements Like, User {

    public String msg_id; // string类型id
    public String sec_openid; // 点赞用户的加密openid，当前其实没有加密
    public String like_num; // 点赞数量，上游2s合并一次数据
    public String avatar_url; // 点赞用户头像
    public String nickname; // 点赞用户昵称(不加密)
    public Long timestamp; // 点赞毫秒级时间戳

    //由代码赋值
    public String roomID;

    @Override
    public User user() {
        return this;
    }

    @Override
    public long count() {
        return Long.parseLong(like_num);
    }

    @Override
    public String roomID() {
        return roomID;
    }

    @Override
    public String nickName() {
        return nickname;
    }

    @Override
    public String avatar() {
        return avatar_url;
    }

    @Override
    public String userID() {
        return sec_openid;
    }
    
}
