// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/SyncStreamInfoMessage.proto
// Protobuf Java Version: 4.27.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class SyncStreamInfoMessageOuterClass {
  private SyncStreamInfoMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      SyncStreamInfoMessageOuterClass.class.getName());
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
    internal_static_SyncStreamInfoMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SyncStreamInfoMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2douyin_hack/webcast/im/SyncStreamInfoM" +
      "essage.proto\032#douyin_hack/webcast/im/Com" +
      "mon.proto\"^\n\025SyncStreamInfoMessage\022\021\n\tti" +
      "mestamp\030\001 \001(\003\022\013\n\003key\030\002 \001(\t\022\014\n\004info\030\003 \001(\t" +
      "\022\027\n\006common\030\004 \001(\0132\007.CommonBG\nCcool.scx.li" +
      "ve_room_watcher.impl.douyin_hack.proto_e" +
      "ntity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
        });
    internal_static_SyncStreamInfoMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SyncStreamInfoMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SyncStreamInfoMessage_descriptor,
        new java.lang.String[] { "Timestamp", "Key", "Info", "Common", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
