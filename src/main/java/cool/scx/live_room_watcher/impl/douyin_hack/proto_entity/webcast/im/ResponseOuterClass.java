// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/Response.proto
// Protobuf Java Version: 4.28.2

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class ResponseOuterClass {
  private ResponseOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      ResponseOuterClass.class.getName());
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
    internal_static_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%douyin_hack/webcast/im/Response.proto\032" +
      "$douyin_hack/webcast/im/Message.proto\"\214\002" +
      "\n\010Response\022\032\n\010messages\030\001 \003(\0132\010.Message\022\016" +
      "\n\006cursor\030\002 \001(\t\022\026\n\016fetch_interval\030\003 \001(\003\022\013" +
      "\n\003now\030\004 \001(\003\022\024\n\014internal_ext\030\005 \001(\t\022\022\n\nfet" +
      "ch_type\030\006 \001(\005\022\032\n\022heartbeat_duration\030\010 \001(" +
      "\003\022\020\n\010need_ack\030\t \001(\010\022\023\n\013push_server\030\n \001(\t" +
      "\022\023\n\013live_cursor\030\013 \001(\t\022\027\n\017history_no_more" +
      "\030\014 \001(\010\022\024\n\014proxy_server\030\r \001(\tBG\nCcool.scx" +
      ".live_room_watcher.impl.douyin_hack.prot" +
      "o_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.MessageOuterClass.getDescriptor(),
        });
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Response_descriptor,
        new java.lang.String[] { "Messages", "Cursor", "FetchInterval", "Now", "InternalExt", "FetchType", "HeartbeatDuration", "NeedAck", "PushServer", "LiveCursor", "HistoryNoMore", "ProxyServer", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.MessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
