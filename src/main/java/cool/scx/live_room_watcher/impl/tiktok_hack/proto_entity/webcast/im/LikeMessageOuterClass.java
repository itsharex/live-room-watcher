// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tiktok_hack/webcast/im/LikeMessage.proto
// Protobuf Java Version: 4.27.1

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im;

public final class LikeMessageOuterClass {
  private LikeMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      LikeMessageOuterClass.class.getName());
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
    internal_static_tiktok_hack_LikeMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_LikeMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(tiktok_hack/webcast/im/LikeMessage.pro" +
      "to\022\013tiktok_hack\032#tiktok_hack/webcast/im/" +
      "Common.proto\0324tiktok_hack/webcast/im/Pub" +
      "licAreaMessageCommon.proto\0321tiktok_hack/" +
      "webcast/im/SpecifiedDisplayText.proto\032#t" +
      "iktok_hack/webcast/data/User.proto\032$tikt" +
      "ok_hack/webcast/data/Image.proto\032)tiktok" +
      "_hack/webcast/data/LikeEffect.proto\"\205\003\n\013" +
      "LikeMessage\022#\n\006common\030\001 \001(\0132\023.tiktok_hac" +
      "k.Common\022\r\n\005count\030\002 \001(\003\022\r\n\005total\030\003 \001(\t\022\r" +
      "\n\005color\030\004 \001(\t\022\037\n\004user\030\005 \001(\0132\021.tiktok_hac" +
      "k.User\022\014\n\004icon\030\006 \001(\t\022%\n\ticonsList\030\007 \001(\0132" +
      "\022.tiktok_hack.Image\022C\n\030specifiedDisplayT" +
      "extList\030\010 \003(\0132!.tiktok_hack.SpecifiedDis" +
      "playText\022\021\n\teffectCnt\030\t \001(\t\022/\n\016likeEffec" +
      "tList\030\n \003(\0132\027.tiktok_hack.LikeEffect\022E\n\027" +
      "publicAreaMessageCommon\030\013 \001(\0132$.tiktok_h" +
      "ack.PublicAreaMessageCommonBG\nCcool.scx." +
      "live_room_watcher.impl.tiktok_hack.proto" +
      "_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.PublicAreaMessageCommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LikeEffectOuterClass.getDescriptor(),
        });
    internal_static_tiktok_hack_LikeMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tiktok_hack_LikeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_LikeMessage_descriptor,
        new java.lang.String[] { "Common", "Count", "Total", "Color", "User", "Icon", "IconsList", "SpecifiedDisplayTextList", "EffectCnt", "LikeEffectList", "PublicAreaMessageCommon", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.PublicAreaMessageCommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LikeEffectOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
