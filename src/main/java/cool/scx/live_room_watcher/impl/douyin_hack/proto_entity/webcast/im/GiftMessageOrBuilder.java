// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/GiftMessage.proto
// Protobuf Java Version: 4.27.3

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface GiftMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GiftMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 gift_id = 2;</code>
   * @return The giftId.
   */
  long getGiftId();

  /**
   * <code>int64 group_count = 4;</code>
   * @return The groupCount.
   */
  long getGroupCount();

  /**
   * <code>int64 repeat_count = 5;</code>
   * @return The repeatCount.
   */
  long getRepeatCount();

  /**
   * <code>int64 combo_count = 6;</code>
   * @return The comboCount.
   */
  long getComboCount();

  /**
   * <code>.User user = 7;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.User user = 7;</code>
   * @return The user.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getUser();
  /**
   * <code>.User user = 7;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.User to_user = 8;</code>
   * @return Whether the toUser field is set.
   */
  boolean hasToUser();
  /**
   * <code>.User to_user = 8;</code>
   * @return The toUser.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getToUser();
  /**
   * <code>.User to_user = 8;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getToUserOrBuilder();

  /**
   * <code>.GiftStruct gift = 15;</code>
   * @return Whether the gift field is set.
   */
  boolean hasGift();
  /**
   * <code>.GiftStruct gift = 15;</code>
   * @return The gift.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftStruct getGift();
  /**
   * <code>.GiftStruct gift = 15;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftStructOrBuilder getGiftOrBuilder();

  /**
   * <code>int64 total_count = 29;</code>
   * @return The totalCount.
   */
  long getTotalCount();
}
