// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/MemberMessage.proto
// Protobuf Java Version: 4.27.2

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class MemberMessageOuterClass {
  private MemberMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      MemberMessageOuterClass.class.getName());
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
    internal_static_MemberMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MemberMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*douyin_hack/webcast/im/MemberMessage.p" +
      "roto\032#douyin_hack/webcast/im/Common.prot" +
      "o\032#douyin_hack/webcast/data/User.proto\"\224" +
      "\002\n\rMemberMessage\022\027\n\006common\030\001 \001(\0132\007.Commo" +
      "n\022\023\n\004user\030\002 \001(\0132\005.User\022\024\n\014member_count\030\003" +
      " \001(\003\022\027\n\010operator\030\004 \001(\0132\005.User\022\027\n\017is_set_" +
      "to_admin\030\005 \001(\010\022\023\n\013is_top_user\030\006 \001(\010\022\022\n\nr" +
      "ank_score\030\007 \001(\003\022\023\n\013top_user_no\030\010 \001(\003\022\022\n\n" +
      "enter_type\030\t \001(\003\022\016\n\006action\030\n \001(\003\022\032\n\022acti" +
      "on_description\030\013 \001(\t\022\017\n\007user_id\030\014 \001(\003BG\n" +
      "Ccool.scx.live_room_watcher.impl.douyin_" +
      "hack.proto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
        });
    internal_static_MemberMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MemberMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MemberMessage_descriptor,
        new java.lang.String[] { "Common", "User", "MemberCount", "Operator", "IsSetToAdmin", "IsTopUser", "RankScore", "TopUserNo", "EnterType", "Action", "ActionDescription", "UserId", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
