// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/GiftMessage.proto
// Protobuf Java Version: 4.29.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class GiftMessageOuterClass {
  private GiftMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      GiftMessageOuterClass.class.getName());
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
    internal_static_GiftMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GiftMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(douyin_hack/webcast/im/GiftMessage.pro" +
      "to\032#douyin_hack/webcast/data/User.proto\032" +
      ")douyin_hack/webcast/data/GiftStruct.pro" +
      "to\"\273\001\n\013GiftMessage\022\017\n\007gift_id\030\002 \001(\003\022\023\n\013g" +
      "roup_count\030\004 \001(\003\022\024\n\014repeat_count\030\005 \001(\003\022\023" +
      "\n\013combo_count\030\006 \001(\003\022\023\n\004user\030\007 \001(\0132\005.User" +
      "\022\026\n\007to_user\030\010 \001(\0132\005.User\022\031\n\004gift\030\017 \001(\0132\013" +
      ".GiftStruct\022\023\n\013total_count\030\035 \001(\003BG\nCcool" +
      ".scx.live_room_watcher.impl.douyin_hack." +
      "proto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftStructOuterClass.getDescriptor(),
        });
    internal_static_GiftMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GiftMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GiftMessage_descriptor,
        new java.lang.String[] { "GiftId", "GroupCount", "RepeatCount", "ComboCount", "User", "ToUser", "Gift", "TotalCount", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.GiftStructOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
