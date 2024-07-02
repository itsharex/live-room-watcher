// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/ScreenChatMessage.proto
// Protobuf Java Version: 4.27.1

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface ScreenChatMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ScreenChatMessage)
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
   * <code>.User user = 2;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.User user = 2;</code>
   * @return The user.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getUser();
  /**
   * <code>.User user = 2;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getUserOrBuilder();

  /**
   * <code>int64 screenChatType = 3;</code>
   * @return The screenChatType.
   */
  long getScreenChatType();

  /**
   * <code>string content = 4;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 4;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>int64 priority = 5;</code>
   * @return The priority.
   */
  long getPriority();

  /**
   * <code>.ScreenChatMessage.Effect effect = 6;</code>
   * @return Whether the effect field is set.
   */
  boolean hasEffect();
  /**
   * <code>.ScreenChatMessage.Effect effect = 6;</code>
   * @return The effect.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ScreenChatMessage.Effect getEffect();
  /**
   * <code>.ScreenChatMessage.Effect effect = 6;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ScreenChatMessage.EffectOrBuilder getEffectOrBuilder();

  /**
   * <code>.Image backgroundImage = 7;</code>
   * @return Whether the backgroundImage field is set.
   */
  boolean hasBackgroundImage();
  /**
   * <code>.Image backgroundImage = 7;</code>
   * @return The backgroundImage.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getBackgroundImage();
  /**
   * <code>.Image backgroundImage = 7;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getBackgroundImageOrBuilder();

  /**
   * <code>.ScreenChatMessage.Effect effectV2 = 8;</code>
   * @return Whether the effectV2 field is set.
   */
  boolean hasEffectV2();
  /**
   * <code>.ScreenChatMessage.Effect effectV2 = 8;</code>
   * @return The effectV2.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ScreenChatMessage.Effect getEffectV2();
  /**
   * <code>.ScreenChatMessage.Effect effectV2 = 8;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ScreenChatMessage.EffectOrBuilder getEffectV2OrBuilder();

  /**
   * <code>.Image backgroundImageV2 = 9;</code>
   * @return Whether the backgroundImageV2 field is set.
   */
  boolean hasBackgroundImageV2();
  /**
   * <code>.Image backgroundImageV2 = 9;</code>
   * @return The backgroundImageV2.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getBackgroundImageV2();
  /**
   * <code>.Image backgroundImageV2 = 9;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getBackgroundImageV2OrBuilder();

  /**
   * <code>.PublicAreaCommon publicAreaCommon = 10;</code>
   * @return Whether the publicAreaCommon field is set.
   */
  boolean hasPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon publicAreaCommon = 10;</code>
   * @return The publicAreaCommon.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon getPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon publicAreaCommon = 10;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOrBuilder getPublicAreaCommonOrBuilder();

  /**
   * <code>.ScreenChatMessage.OfficialCommentConfig officialCommentConfig = 11;</code>
   * @return Whether the officialCommentConfig field is set.
   */
  boolean hasOfficialCommentConfig();
  /**
   * <code>.ScreenChatMessage.OfficialCommentConfig officialCommentConfig = 11;</code>
   * @return The officialCommentConfig.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ScreenChatMessage.OfficialCommentConfig getOfficialCommentConfig();
  /**
   * <code>.ScreenChatMessage.OfficialCommentConfig officialCommentConfig = 11;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ScreenChatMessage.OfficialCommentConfigOrBuilder getOfficialCommentConfigOrBuilder();

  /**
   * <code>int64 eventTime = 12;</code>
   * @return The eventTime.
   */
  long getEventTime();

  /**
   * <code>bool sendReview = 13;</code>
   * @return The sendReview.
   */
  boolean getSendReview();

  /**
   * <code>.ChatIdentity chatIdentityInfo = 14;</code>
   * @return Whether the chatIdentityInfo field is set.
   */
  boolean hasChatIdentityInfo();
  /**
   * <code>.ChatIdentity chatIdentityInfo = 14;</code>
   * @return The chatIdentityInfo.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity getChatIdentityInfo();
  /**
   * <code>.ChatIdentity chatIdentityInfo = 14;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentityOrBuilder getChatIdentityInfoOrBuilder();

  /**
   * <code>.Text rtfContent = 30;</code>
   * @return Whether the rtfContent field is set.
   */
  boolean hasRtfContent();
  /**
   * <code>.Text rtfContent = 30;</code>
   * @return The rtfContent.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Text getRtfContent();
  /**
   * <code>.Text rtfContent = 30;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOrBuilder getRtfContentOrBuilder();
}
