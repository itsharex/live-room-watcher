// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/Common.proto
// Protobuf Java Version: 4.28.2

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface CommonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common)
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
   * <code>int64 msg_id = 2;</code>
   * @return The msgId.
   */
  long getMsgId();

  /**
   * <code>int64 room_id = 3;</code>
   * @return The roomId.
   */
  long getRoomId();

  /**
   * <code>int64 create_time = 4;</code>
   * @return The createTime.
   */
  long getCreateTime();

  /**
   * <code>.User user = 15;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.User user = 15;</code>
   * @return The user.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getUser();
  /**
   * <code>.User user = 15;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.Room room = 16;</code>
   * @return Whether the room field is set.
   */
  boolean hasRoom();
  /**
   * <code>.Room room = 16;</code>
   * @return The room.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room getRoom();
  /**
   * <code>.Room room = 16;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOrBuilder getRoomOrBuilder();
}
