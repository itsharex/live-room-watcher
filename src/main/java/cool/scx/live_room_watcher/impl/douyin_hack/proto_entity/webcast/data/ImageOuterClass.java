// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/data/Image.proto
// Protobuf Java Version: 4.28.3

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public final class ImageOuterClass {
  private ImageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ImageOuterClass.class.getName());
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
    internal_static_Image_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_Content_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Image_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_NinePatchSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Image_NinePatchSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$douyin_hack/webcast/data/Image.proto\"\212" +
      "\003\n\005Image\022\020\n\010url_list\030\001 \003(\t\022\013\n\003uri\030\002 \001(\t\022" +
      "\016\n\006height\030\003 \001(\003\022\r\n\005width\030\004 \001(\003\022\021\n\tavg_co" +
      "lor\030\005 \001(\t\022\022\n\nimage_type\030\006 \001(\005\022\024\n\014open_we" +
      "b_url\030\007 \001(\t\022\037\n\007content\030\010 \001(\0132\016.Image.Con" +
      "tent\022\023\n\013is_animated\030\t \001(\010\0222\n\021flex_settin" +
      "g_list\030\n \003(\0132\027.Image.NinePatchSetting\0222\n" +
      "\021text_setting_list\030\013 \003(\0132\027.Image.NinePat" +
      "chSetting\032T\n\007Content\022\014\n\004name\030\001 \001(\t\022\022\n\nfo" +
      "nt_color\030\002 \001(\t\022\r\n\005level\030\003 \001(\003\022\030\n\020alterna" +
      "tive_text\030\004 \001(\t\032\022\n\020NinePatchSettingBI\nEc" +
      "ool.scx.live_room_watcher.impl.douyin_ha" +
      "ck.proto_entity.webcast.dataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Image_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Image_descriptor,
        new java.lang.String[] { "UrlList", "Uri", "Height", "Width", "AvgColor", "ImageType", "OpenWebUrl", "Content", "IsAnimated", "FlexSettingList", "TextSettingList", });
    internal_static_Image_Content_descriptor =
      internal_static_Image_descriptor.getNestedTypes().get(0);
    internal_static_Image_Content_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Image_Content_descriptor,
        new java.lang.String[] { "Name", "FontColor", "Level", "AlternativeText", });
    internal_static_Image_NinePatchSetting_descriptor =
      internal_static_Image_descriptor.getNestedTypes().get(1);
    internal_static_Image_NinePatchSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Image_NinePatchSetting_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
