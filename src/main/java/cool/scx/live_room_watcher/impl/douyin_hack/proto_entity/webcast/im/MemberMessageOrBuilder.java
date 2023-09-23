// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/MemberMessage.proto

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface MemberMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MemberMessage)
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
   * <code>int64 memberCount = 3;</code>
   * @return The memberCount.
   */
  long getMemberCount();

  /**
   * <code>.User operator = 4;</code>
   * @return Whether the operator field is set.
   */
  boolean hasOperator();
  /**
   * <code>.User operator = 4;</code>
   * @return The operator.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getOperator();
  /**
   * <code>.User operator = 4;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getOperatorOrBuilder();

  /**
   * <code>bool isSetToAdmin = 5;</code>
   * @return The isSetToAdmin.
   */
  boolean getIsSetToAdmin();

  /**
   * <code>bool isTopUser = 6;</code>
   * @return The isTopUser.
   */
  boolean getIsTopUser();

  /**
   * <code>int64 rankScore = 7;</code>
   * @return The rankScore.
   */
  long getRankScore();

  /**
   * <code>int64 topUserNo = 8;</code>
   * @return The topUserNo.
   */
  long getTopUserNo();

  /**
   * <code>int64 enterType = 9;</code>
   * @return The enterType.
   */
  long getEnterType();

  /**
   * <code>int64 action = 10;</code>
   * @return The action.
   */
  long getAction();

  /**
   * <code>string actionDescription = 11;</code>
   * @return The actionDescription.
   */
  java.lang.String getActionDescription();
  /**
   * <code>string actionDescription = 11;</code>
   * @return The bytes for actionDescription.
   */
  com.google.protobuf.ByteString
      getActionDescriptionBytes();

  /**
   * <code>int64 userId = 12;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>.MemberMessage.EffectConfig effectConfig = 13;</code>
   * @return Whether the effectConfig field is set.
   */
  boolean hasEffectConfig();
  /**
   * <code>.MemberMessage.EffectConfig effectConfig = 13;</code>
   * @return The effectConfig.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.MemberMessage.EffectConfig getEffectConfig();
  /**
   * <code>.MemberMessage.EffectConfig effectConfig = 13;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.MemberMessage.EffectConfigOrBuilder getEffectConfigOrBuilder();

  /**
   * <code>string popStr = 14;</code>
   * @return The popStr.
   */
  java.lang.String getPopStr();
  /**
   * <code>string popStr = 14;</code>
   * @return The bytes for popStr.
   */
  com.google.protobuf.ByteString
      getPopStrBytes();

  /**
   * <code>.MemberMessage.EffectConfig enterEffectConfig = 15;</code>
   * @return Whether the enterEffectConfig field is set.
   */
  boolean hasEnterEffectConfig();
  /**
   * <code>.MemberMessage.EffectConfig enterEffectConfig = 15;</code>
   * @return The enterEffectConfig.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.MemberMessage.EffectConfig getEnterEffectConfig();
  /**
   * <code>.MemberMessage.EffectConfig enterEffectConfig = 15;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.MemberMessage.EffectConfigOrBuilder getEnterEffectConfigOrBuilder();

  /**
   * <code>.Image backgroundImage = 16;</code>
   * @return Whether the backgroundImage field is set.
   */
  boolean hasBackgroundImage();
  /**
   * <code>.Image backgroundImage = 16;</code>
   * @return The backgroundImage.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getBackgroundImage();
  /**
   * <code>.Image backgroundImage = 16;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getBackgroundImageOrBuilder();

  /**
   * <code>.Image backgroundImageV2 = 17;</code>
   * @return Whether the backgroundImageV2 field is set.
   */
  boolean hasBackgroundImageV2();
  /**
   * <code>.Image backgroundImageV2 = 17;</code>
   * @return The backgroundImageV2.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getBackgroundImageV2();
  /**
   * <code>.Image backgroundImageV2 = 17;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getBackgroundImageV2OrBuilder();

  /**
   * <code>.Text anchorDisplayText = 18;</code>
   * @return Whether the anchorDisplayText field is set.
   */
  boolean hasAnchorDisplayText();
  /**
   * <code>.Text anchorDisplayText = 18;</code>
   * @return The anchorDisplayText.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Text getAnchorDisplayText();
  /**
   * <code>.Text anchorDisplayText = 18;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOrBuilder getAnchorDisplayTextOrBuilder();

  /**
   * <code>.PublicAreaCommon publicAreaCommon = 19;</code>
   * @return Whether the publicAreaCommon field is set.
   */
  boolean hasPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon publicAreaCommon = 19;</code>
   * @return The publicAreaCommon.
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommon getPublicAreaCommon();
  /**
   * <code>.PublicAreaCommon publicAreaCommon = 19;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOrBuilder getPublicAreaCommonOrBuilder();

  /**
   * <code>int64 userEnterTipType = 20;</code>
   * @return The userEnterTipType.
   */
  long getUserEnterTipType();

  /**
   * <code>int64 anchorEnterTipType = 21;</code>
   * @return The anchorEnterTipType.
   */
  long getAnchorEnterTipType();

  /**
   * <code>map&lt;string, string&gt; buriedPointMap = 22;</code>
   */
  int getBuriedPointMapCount();
  /**
   * <code>map&lt;string, string&gt; buriedPointMap = 22;</code>
   */
  boolean containsBuriedPointMap(
      java.lang.String key);
  /**
   * Use {@link #getBuriedPointMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getBuriedPointMap();
  /**
   * <code>map&lt;string, string&gt; buriedPointMap = 22;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getBuriedPointMapMap();
  /**
   * <code>map&lt;string, string&gt; buriedPointMap = 22;</code>
   */
  /* nullable */
java.lang.String getBuriedPointMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; buriedPointMap = 22;</code>
   */
  java.lang.String getBuriedPointMapOrThrow(
      java.lang.String key);
}