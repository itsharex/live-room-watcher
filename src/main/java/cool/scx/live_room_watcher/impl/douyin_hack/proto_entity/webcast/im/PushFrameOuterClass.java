// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/PushFrame.proto
// Protobuf Java Version: 4.29.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class PushFrameOuterClass {
  private PushFrameOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      PushFrameOuterClass.class.getName());
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
    internal_static_PushFrame_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PushFrame_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&douyin_hack/webcast/im/PushFrame.proto" +
      "\032\'douyin_hack/webcast/im/PushHeader.prot" +
      "o\"\273\001\n\tPushFrame\022\r\n\005SeqID\030\001 \001(\004\022\r\n\005LogID\030" +
      "\002 \001(\004\022\017\n\007service\030\003 \001(\005\022\016\n\006method\030\004 \001(\005\022\034" +
      "\n\007headers\030\005 \003(\0132\013.PushHeader\022\030\n\020payload_" +
      "encoding\030\006 \001(\t\022\024\n\014payload_type\030\007 \001(\t\022\017\n\007" +
      "payload\030\010 \001(\014\022\020\n\010LodIDNew\030\t \001(\tBG\nCcool." +
      "scx.live_room_watcher.impl.douyin_hack.p" +
      "roto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PushHeaderOuterClass.getDescriptor(),
        });
    internal_static_PushFrame_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PushFrame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PushFrame_descriptor,
        new java.lang.String[] { "SeqID", "LogID", "Service", "Method", "Headers", "PayloadEncoding", "PayloadType", "Payload", "LodIDNew", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PushHeaderOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
