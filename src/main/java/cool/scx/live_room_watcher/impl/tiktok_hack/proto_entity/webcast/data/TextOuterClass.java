// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tiktok_hack/webcast/data/Text.proto
// Protobuf Java Version: 4.28.3

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data;

public final class TextOuterClass {
  private TextOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      TextOuterClass.class.getName());
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
    internal_static_tiktok_hack_Text_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_Text_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#tiktok_hack/webcast/data/Text.proto\022\013t" +
      "iktok_hack\032)tiktok_hack/webcast/data/Tex" +
      "tFormat.proto\032(tiktok_hack/webcast/data/" +
      "TextPiece.proto\"\207\001\n\004Text\022\013\n\003key\030\001 \001(\t\022\026\n" +
      "\016defaultPattern\030\002 \001(\t\022.\n\rdefaultFormat\030\003" +
      " \001(\0132\027.tiktok_hack.TextFormat\022*\n\npiecesL" +
      "ist\030\004 \003(\0132\026.tiktok_hack.TextPieceBI\nEcoo" +
      "l.scx.live_room_watcher.impl.tiktok_hack" +
      ".proto_entity.webcast.dataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.TextFormatOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.TextPieceOuterClass.getDescriptor(),
        });
    internal_static_tiktok_hack_Text_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tiktok_hack_Text_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_Text_descriptor,
        new java.lang.String[] { "Key", "DefaultPattern", "DefaultFormat", "PiecesList", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.TextFormatOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.TextPieceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
