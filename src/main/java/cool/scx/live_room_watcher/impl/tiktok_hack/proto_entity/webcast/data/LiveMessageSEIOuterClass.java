// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tiktok_hack/webcast/data/LiveMessageSEI.proto
// Protobuf Java Version: 4.27.3

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data;

public final class LiveMessageSEIOuterClass {
  private LiveMessageSEIOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      LiveMessageSEIOuterClass.class.getName());
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
    internal_static_tiktok_hack_LiveMessageSEI_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_LiveMessageSEI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-tiktok_hack/webcast/data/LiveMessageSE" +
      "I.proto\022\013tiktok_hack\032,tiktok_hack/webcas" +
      "t/data/LiveMessageID.proto\"Q\n\016LiveMessag" +
      "eSEI\022,\n\010uniqueId\030\001 \001(\0132\032.tiktok_hack.Liv" +
      "eMessageID\022\021\n\ttimestamp\030\002 \001(\tBI\nEcool.sc" +
      "x.live_room_watcher.impl.tiktok_hack.pro" +
      "to_entity.webcast.dataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOuterClass.getDescriptor(),
        });
    internal_static_tiktok_hack_LiveMessageSEI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tiktok_hack_LiveMessageSEI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_LiveMessageSEI_descriptor,
        new java.lang.String[] { "UniqueId", "Timestamp", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
