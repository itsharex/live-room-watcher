// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/ChatMessage.proto
// Protobuf Java Version: 4.27.2

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class ChatMessageOuterClass {
  private ChatMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
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
    internal_static_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(douyin_hack/webcast/im/ChatMessage.pro" +
      "to\032#douyin_hack/webcast/data/User.proto\"" +
      "3\n\013ChatMessage\022\023\n\004user\030\002 \001(\0132\005.User\022\017\n\007c" +
      "ontent\030\003 \001(\tBG\nCcool.scx.live_room_watch" +
      "er.impl.douyin_hack.proto_entity.webcast" +
      ".imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
        });
    internal_static_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ChatMessage_descriptor,
        new java.lang.String[] { "User", "Content", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
