// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/ChatMessage.proto
// Protobuf Java Version: 4.27.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface ChatMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChatMessage)
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
   * <code>string content = 3;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>bool visibleToSender = 4;</code>
   * @return The visibleToSender.
   */
  boolean getVisibleToSender();

  /**
   * <code>.Image backgroundImage = 5;</code>
   * @return Whether the backgroundImage field is set.
   */
  boolean hasBackgroundImage();
  /**
   * <code>.Image backgroundImage = 5;</code>
   * @return The backgroundImage.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getBackgroundImage();
  /**
   * <code>.Image backgroundImage = 5;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getBackgroundImageOrBuilder();

  /**
   * <code>string fullScreenTextColor = 6;</code>
   * @return The fullScreenTextColor.
   */
  java.lang.String getFullScreenTextColor();
  /**
   * <code>string fullScreenTextColor = 6;</code>
   * @return The bytes for fullScreenTextColor.
   */
  com.google.protobuf.ByteString
      getFullScreenTextColorBytes();

  /**
   * <code>.Image backgroundImageV2 = 7;</code>
   * @return Whether the backgroundImageV2 field is set.
   */
  boolean hasBackgroundImageV2();
  /**
   * <code>.Image backgroundImageV2 = 7;</code>
   * @return The backgroundImageV2.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getBackgroundImageV2();
  /**
   * <code>.Image backgroundImageV2 = 7;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getBackgroundImageV2OrBuilder();

  /**
   * <code>.PublicAreaCommon publicAreaCommon = 9;</code>
   * @return Whether the publicAreaCommon field is set.
   */
  boolean hasPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon publicAreaCommon = 9;</code>
   * @return The publicAreaCommon.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon getPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon publicAreaCommon = 9;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOrBuilder getPublicAreaCommonOrBuilder();

  /**
   * <code>.Image giftImage = 10;</code>
   * @return Whether the giftImage field is set.
   */
  boolean hasGiftImage();
  /**
   * <code>.Image giftImage = 10;</code>
   * @return The giftImage.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getGiftImage();
  /**
   * <code>.Image giftImage = 10;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getGiftImageOrBuilder();

  /**
   * <code>int64 agreeMsgId = 11;</code>
   * @return The agreeMsgId.
   */
  long getAgreeMsgId();

  /**
   * <code>int32 priorityLevel = 12;</code>
   * @return The priorityLevel.
   */
  int getPriorityLevel();

  /**
   * <code>.LandscapeAreaCommon landscapeAreaCommon = 13;</code>
   * @return Whether the landscapeAreaCommon field is set.
   */
  boolean hasLandscapeAreaCommon();
  /**
   * <code>.LandscapeAreaCommon landscapeAreaCommon = 13;</code>
   * @return The landscapeAreaCommon.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LandscapeAreaCommon getLandscapeAreaCommon();
  /**
   * <code>.LandscapeAreaCommon landscapeAreaCommon = 13;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LandscapeAreaCommonOrBuilder getLandscapeAreaCommonOrBuilder();

  /**
   * <code>int64 eventTime = 15;</code>
   * @return The eventTime.
   */
  long getEventTime();

  /**
   * <code>bool sendReview = 16;</code>
   * @return The sendReview.
   */
  boolean getSendReview();

  /**
   * <code>bool fromIntercom = 17;</code>
   * @return The fromIntercom.
   */
  boolean getFromIntercom();

  /**
   * <code>bool intercomHideUserCard = 18;</code>
   * @return The intercomHideUserCard.
   */
  boolean getIntercomHideUserCard();

  /**
   * <code>int32 chatTagsList = 19;</code>
   * @return The chatTagsList.
   */
  int getChatTagsList();

  /**
   * <code>int64 chatBy = 20;</code>
   * @return The chatBy.
   */
  long getChatBy();

  /**
   * <code>int32 individualChatPriority = 21;</code>
   * @return The individualChatPriority.
   */
  int getIndividualChatPriority();

  /**
   * <code>.Text rtfContent = 40;</code>
   * @return Whether the rtfContent field is set.
   */
  boolean hasRtfContent();
  /**
   * <code>.Text rtfContent = 40;</code>
   * @return The rtfContent.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Text getRtfContent();
  /**
   * <code>.Text rtfContent = 40;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOrBuilder getRtfContentOrBuilder();
}
