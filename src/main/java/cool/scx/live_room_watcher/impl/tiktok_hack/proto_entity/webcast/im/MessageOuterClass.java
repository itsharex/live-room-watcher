// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tiktok_hack/webcast/im/Message.proto
// Protobuf Java Version: 4.28.2

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im;

public final class MessageOuterClass {
  private MessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      MessageOuterClass.class.getName());
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
    internal_static_tiktok_hack_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$tiktok_hack/webcast/im/Message.proto\022\013" +
      "tiktok_hack\"m\n\007Message\022\016\n\006method\030\001 \001(\t\022\017" +
      "\n\007payload\030\002 \001(\014\022\r\n\005msgId\030\003 \001(\003\022\017\n\007msgTyp" +
      "e\030\004 \001(\005\022\016\n\006offset\030\005 \001(\003\022\021\n\tisHistory\030\006 \001" +
      "(\010BG\nCcool.scx.live_room_watcher.impl.ti" +
      "ktok_hack.proto_entity.webcast.imP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tiktok_hack_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tiktok_hack_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_Message_descriptor,
        new java.lang.String[] { "Method", "Payload", "MsgId", "MsgType", "Offset", "IsHistory", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
