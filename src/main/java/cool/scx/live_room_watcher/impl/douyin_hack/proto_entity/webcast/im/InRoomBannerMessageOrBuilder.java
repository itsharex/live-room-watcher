// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/InRoomBannerMessage.proto
// Protobuf Java Version: 4.27.1

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface InRoomBannerMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:InRoomBannerMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon();
  /**
   * <code>.Common common = 1;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder();

  /**
   * <code>string extra = 2;</code>
   * @return The extra.
   */
  java.lang.String getExtra();
  /**
   * <code>string extra = 2;</code>
   * @return The bytes for extra.
   */
  com.google.protobuf.ByteString
      getExtraBytes();

  /**
   * <code>.InRoomBannerMessage.PositionType position = 3;</code>
   * @return The enum numeric value on the wire for position.
   */
  int getPositionValue();
  /**
   * <code>.InRoomBannerMessage.PositionType position = 3;</code>
   * @return The position.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.InRoomBannerMessage.PositionType getPosition();

  /**
   * <code>.ActionType actionType = 4;</code>
   * @return The enum numeric value on the wire for actionType.
   */
  int getActionTypeValue();
  /**
   * <code>.ActionType actionType = 4;</code>
   * @return The actionType.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ActionType getActionType();

  /**
   * <code>string containerUrl = 5;</code>
   * @return The containerUrl.
   */
  java.lang.String getContainerUrl();
  /**
   * <code>string containerUrl = 5;</code>
   * @return The bytes for containerUrl.
   */
  com.google.protobuf.ByteString
      getContainerUrlBytes();

  /**
   * <code>string lynxContainerUrl = 6;</code>
   * @return The lynxContainerUrl.
   */
  java.lang.String getLynxContainerUrl();
  /**
   * <code>string lynxContainerUrl = 6;</code>
   * @return The bytes for lynxContainerUrl.
   */
  com.google.protobuf.ByteString
      getLynxContainerUrlBytes();

  /**
   * <code>.InRoomBannerMessage.ContainerType containerType = 7;</code>
   * @return The enum numeric value on the wire for containerType.
   */
  int getContainerTypeValue();
  /**
   * <code>.InRoomBannerMessage.ContainerType containerType = 7;</code>
   * @return The containerType.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.InRoomBannerMessage.ContainerType getContainerType();

  /**
   * <code>.InRoomBannerMessage.OpType opType = 8;</code>
   * @return The enum numeric value on the wire for opType.
   */
  int getOpTypeValue();
  /**
   * <code>.InRoomBannerMessage.OpType opType = 8;</code>
   * @return The opType.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.InRoomBannerMessage.OpType getOpType();
}
