// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tiktok_hack/webcast/im/ChatMessage.proto
// Protobuf Java Version: 4.28.3

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im;

public final class ChatMessageOuterClass {
  private ChatMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ChatMessageOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tiktok_hack_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_ChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tiktok_hack_ChatMessage_EmoteWithIndex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_ChatMessage_EmoteWithIndex_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(tiktok_hack/webcast/im/ChatMessage.pro" +
      "to\022\013tiktok_hack\032#tiktok_hack/webcast/im/" +
      "Common.proto\032-tiktok_hack/webcast/im/Pub" +
      "licAreaCommon.proto\0324tiktok_hack/webcast" +
      "/im/PublicAreaMessageCommon.proto\0320tikto" +
      "k_hack/webcast/im/CommentQualityScore.pr" +
      "oto\032+tiktok_hack/webcast/data/UserIdenti" +
      "ty.proto\032#tiktok_hack/webcast/data/User." +
      "proto\032$tiktok_hack/webcast/data/Image.pr" +
      "oto\032(tiktok_hack/webcast/data/MsgFilter." +
      "proto\"\277\006\n\013ChatMessage\022#\n\006common\030\001 \001(\0132\023." +
      "tiktok_hack.Common\022\037\n\004user\030\002 \001(\0132\021.tikto" +
      "k_hack.User\022\017\n\007content\030\003 \001(\t\022\027\n\017visibleT" +
      "oSender\030\004 \001(\010\022+\n\017backgroundImage\030\005 \001(\0132\022" +
      ".tiktok_hack.Image\022\033\n\023fullScreenTextColo" +
      "r\030\006 \001(\t\022-\n\021backgroundImageV2\030\007 \001(\0132\022.tik" +
      "tok_hack.Image\0227\n\020publicAreaCommon\030\t \001(\013" +
      "2\035.tiktok_hack.PublicAreaCommon\022%\n\tgiftI" +
      "mage\030\n \001(\0132\022.tiktok_hack.Image\022\021\n\tinputT" +
      "ype\030\013 \001(\003\022!\n\006atUser\030\014 \001(\0132\021.tiktok_hack." +
      "User\022;\n\nemotesList\030\r \003(\0132\'.tiktok_hack.C" +
      "hatMessage.EmoteWithIndex\022\027\n\017contentLang" +
      "uage\030\016 \001(\t\022)\n\tmsgFilter\030\017 \001(\0132\026.tiktok_h" +
      "ack.MsgFilter\022\026\n\016quickChatScene\030\020 \001(\003\022\036\n" +
      "\026communityFlaggedStatus\030\021 \001(\005\022/\n\014userIde" +
      "ntity\030\022 \001(\0132\031.tiktok_hack.UserIdentity\022B" +
      "\n\030commentQualityScoresList\030\023 \003(\0132 .tikto" +
      "k_hack.CommentQualityScore\022\026\n\016commentTag" +
      "List\030\024 \003(\t\022E\n\027publicAreaMessageCommon\030\025 " +
      "\001(\0132$.tiktok_hack.PublicAreaMessageCommo" +
      "n\022\022\n\nscreenTime\030\026 \001(\t\032\020\n\016EmoteWithIndexB" +
      "G\nCcool.scx.live_room_watcher.impl.tikto" +
      "k_hack.proto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.PublicAreaMessageCommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.CommentQualityScoreOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.UserIdentityOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.MsgFilterOuterClass.getDescriptor(),
        });
    internal_static_tiktok_hack_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tiktok_hack_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_ChatMessage_descriptor,
        new java.lang.String[] { "Common", "User", "Content", "VisibleToSender", "BackgroundImage", "FullScreenTextColor", "BackgroundImageV2", "PublicAreaCommon", "GiftImage", "InputType", "AtUser", "EmotesList", "ContentLanguage", "MsgFilter", "QuickChatScene", "CommunityFlaggedStatus", "UserIdentity", "CommentQualityScoresList", "CommentTagList", "PublicAreaMessageCommon", "ScreenTime", });
    internal_static_tiktok_hack_ChatMessage_EmoteWithIndex_descriptor =
      internal_static_tiktok_hack_ChatMessage_descriptor.getNestedTypes().get(0);
    internal_static_tiktok_hack_ChatMessage_EmoteWithIndex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_ChatMessage_EmoteWithIndex_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.PublicAreaMessageCommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.CommentQualityScoreOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.UserIdentityOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.MsgFilterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
