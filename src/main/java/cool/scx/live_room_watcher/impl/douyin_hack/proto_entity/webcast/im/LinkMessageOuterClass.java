// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/LinkMessage.proto
// Protobuf Java Version: 4.27.1

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class LinkMessageOuterClass {
  private LinkMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      LinkMessageOuterClass.class.getName());
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
    internal_static_LinkMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_LinkMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(douyin_hack/webcast/im/LinkMessage.pro" +
      "to\032#douyin_hack/webcast/im/Common.proto\032" +
      "0douyin_hack/webcast/im/LinkerInviteCont" +
      "ent.proto\032/douyin_hack/webcast/im/Linker" +
      "ReplyContent.proto\0320douyin_hack/webcast/" +
      "im/LinkerCreateContent.proto\032/douyin_hac" +
      "k/webcast/im/LinkerCloseContent.proto\032/d" +
      "ouyin_hack/webcast/im/LinkerEnterContent" +
      ".proto\032/douyin_hack/webcast/im/LinkerLea" +
      "veContent.proto\0320douyin_hack/webcast/im/" +
      "LinkerCancelContent.proto\0321douyin_hack/w" +
      "ebcast/im/LinkerKickOutContent.proto\032:do" +
      "uyin_hack/webcast/im/LinkerLinkedListCha" +
      "ngeContent.proto\0324douyin_hack/webcast/im" +
      "/LinkerUpdateUserContent.proto\032;douyin_h" +
      "ack/webcast/im/LinkerWaitingListChangeCo" +
      "ntent.proto\032-douyin_hack/webcast/im/Link" +
      "erBanContent.proto\032.douyin_hack/webcast/" +
      "im/LinkerItemContent.proto\032;douyin_hack/" +
      "webcast/im/LinkerViolationReminderConten" +
      "t.proto\032=douyin_hack/webcast/im/LinkerUp" +
      "dateLinkTypeApplyContent.proto\032=douyin_h" +
      "ack/webcast/im/LinkerUpdateLinkTypeReply" +
      "Content.proto\0325douyin_hack/webcast/im/Li" +
      "nkerAvatarAuditContent.proto\0326douyin_hac" +
      "k/webcast/im/LinkerApplyExpiredContent.p" +
      "roto\032=douyin_hack/webcast/im/LinkerApply" +
      "StrongReminderContent.proto\032<douyin_hack" +
      "/webcast/im/LinkerAnchorStreamSwitchCont" +
      "ent.proto\0325douyin_hack/webcast/im/Linker" +
      "ClickScreenContent.proto\0326douyin_hack/we" +
      "bcast/im/LinkerLockPositionContent.proto" +
      "\032;douyin_hack/webcast/im/LinkerFollowStr" +
      "ongGuideContent.proto\0326douyin_hack/webca" +
      "st/im/LinkerShareVideoImContent.proto\0325d" +
      "ouyin_hack/webcast/im/LinkerGuestInviteC" +
      "ontent.proto\032=douyin_hack/webcast/im/Lin" +
      "kerGuestExitCastScreenContent.proto\0325dou" +
      "yin_hack/webcast/im/LinkerSwitchSceneCon" +
      "tent.proto\032<douyin_hack/webcast/im/LinkP" +
      "haseEnterNextNotifyContent.proto\0328douyin" +
      "_hack/webcast/im/LinkerChangePlayModeCon" +
      "tent.proto\032Bdouyin_hack/webcast/im/Linke" +
      "rLowBalanceForPaidLinkmicContent.proto\0326" +
      "douyin_hack/webcast/im/LinkerDegradeAler" +
      "tContent.proto\032<douyin_hack/webcast/im/L" +
      "inkerEnlargeGuestInviteContent.proto\032;do" +
      "uyin_hack/webcast/im/LinkerEnlargeGuestR" +
      "eplyContent.proto\032;douyin_hack/webcast/i" +
      "m/LinkerEnlargeGuestApplyContent.proto\0324" +
      "douyin_hack/webcast/im/LinkPrepareApplyC" +
      "ontent.proto\0329douyin_hack/webcast/im/Lin" +
      "kerCrossRoomUpdateContent.proto\032?douyin_" +
      "hack/webcast/im/LinkerChangeMultiPKTeamI" +
      "nfoContent.proto\0327douyin_hack/webcast/im" +
      "/CrossRoomLinkInviteContent.proto\0326douyi" +
      "n_hack/webcast/im/CrossRoomLinkReplyCont" +
      "ent.proto\032=douyin_hack/webcast/im/CrossR" +
      "oomLinkCancelInviteContent.proto\0328douyin" +
      "_hack/webcast/im/LinkerResumeAudienceCon" +
      "tent.proto\0327douyin_hack/webcast/im/Linke" +
      "rBattleConnectContent.proto\0325douyin_hack" +
      "/webcast/im/LinkerResumeApplyContent.pro" +
      "to\0324douyin_hack/webcast/im/CrossRoomRTCI" +
      "nfoContent.proto\032=douyin_hack/webcast/im" +
      "/AnchorUpdateLinkmicConfigContent.proto\032" +
      "6douyin_hack/webcast/im/AnchorUpdateLayo" +
      "utContent.proto\0329douyin_hack/webcast/im/" +
      "LinkerApplyRankChangeContent.proto\0324douy" +
      "in_hack/webcast/im/LinkerSysKickOutConte" +
      "nt.proto\"\271\027\n\013LinkMessage\022\027\n\006common\030\001 \001(\013" +
      "2\007.Common\022\023\n\013messageType\030\002 \001(\003\022\020\n\010linker" +
      "Id\030\003 \001(\003\022\r\n\005scene\030\004 \001(\003\022+\n\rinviteContent" +
      "\030\005 \001(\0132\024.LinkerInviteContent\022)\n\014replyCon" +
      "tent\030\006 \001(\0132\023.LinkerReplyContent\022+\n\rcreat" +
      "eContent\030\007 \001(\0132\024.LinkerCreateContent\022)\n\014" +
      "closeContent\030\010 \001(\0132\023.LinkerCloseContent\022" +
      ")\n\014enterContent\030\t \001(\0132\023.LinkerEnterConte" +
      "nt\022)\n\014leaveContent\030\n \001(\0132\023.LinkerLeaveCo" +
      "ntent\022+\n\rcancelContent\030\013 \001(\0132\024.LinkerCan" +
      "celContent\022-\n\016kickOutContent\030\014 \001(\0132\025.Lin" +
      "kerKickOutContent\022?\n\027linkedListChangeCon" +
      "tent\030\r \001(\0132\036.LinkerLinkedListChangeConte" +
      "nt\0223\n\021updateUserContent\030\016 \001(\0132\030.LinkerUp" +
      "dateUserContent\022A\n\030waitingListChangeCont" +
      "ent\030\017 \001(\0132\037.LinkerWaitingListChangeConte" +
      "nt\022%\n\nbanContent\030\020 \001(\0132\021.LinkerBanConten" +
      "t\022\'\n\013itemContent\030\021 \001(\0132\022.LinkerItemConte" +
      "nt\022A\n\030violationReminderContent\030\022 \001(\0132\037.L" +
      "inkerViolationReminderContent\022E\n\032updateL" +
      "inkTypeApplyContent\030\023 \001(\0132!.LinkerUpdate" +
      "LinkTypeApplyContent\022E\n\032updateLinkTypeRe" +
      "plyContent\030\024 \001(\0132!.LinkerUpdateLinkTypeR" +
      "eplyContent\0225\n\022avatarAuditContent\030\025 \001(\0132" +
      "\031.LinkerAvatarAuditContent\0227\n\023applyExpir" +
      "edContent\030\026 \001(\0132\032.LinkerApplyExpiredCont" +
      "ent\022E\n\032applyStrongReminderContent\030\027 \001(\0132" +
      "!.LinkerApplyStrongReminderContent\022C\n\031an" +
      "chorStreamSwitchContent\030\030 \001(\0132 .LinkerAn" +
      "chorStreamSwitchContent\0225\n\022clickScreenCo" +
      "ntent\030\031 \001(\0132\031.LinkerClickScreenContent\0227" +
      "\n\023lockPositionContent\030\032 \001(\0132\032.LinkerLock" +
      "PositionContent\022A\n\030followStrongGuideCont" +
      "ent\030\033 \001(\0132\037.LinkerFollowStrongGuideConte" +
      "nt\0227\n\023shareVideoImContent\030\034 \001(\0132\032.Linker" +
      "ShareVideoImContent\0225\n\022guestInviteConten" +
      "t\030\035 \001(\0132\031.LinkerGuestInviteContent\022@\n\025ex" +
      "itCastScreenContent\030\036 \001(\0132!.LinkerGuestE" +
      "xitCastScreenContent\0225\n\022switchSceneConte" +
      "nt\030\037 \001(\0132\031.LinkerSwitchSceneContent\022C\n\031l" +
      "inkPhaseEnterNextContent\030  \001(\0132 .LinkPha" +
      "seEnterNextNotifyContent\022;\n\025changePlayMo" +
      "deContent\030! \001(\0132\034.LinkerChangePlayModeCo" +
      "ntent\022O\n\037lowBalanceForPaidLinkmicContent" +
      "\030\" \001(\0132&.LinkerLowBalanceForPaidLinkmicC" +
      "ontent\0227\n\023degradeAlertContent\030# \001(\0132\032.Li" +
      "nkerDegradeAlertContent\022C\n\031enlargeGuestI" +
      "nviteContent\030$ \001(\0132 .LinkerEnlargeGuestI" +
      "nviteContent\022A\n\030enlargeGuestReplyContent" +
      "\030% \001(\0132\037.LinkerEnlargeGuestReplyContent\022" +
      "A\n\030enlargeGuestApplyContent\030& \001(\0132\037.Link" +
      "erEnlargeGuestApplyContent\0225\n\023prepareApp" +
      "lyContent\030\' \001(\0132\030.LinkPrepareApplyConten" +
      "t\022=\n\026crossRoomUpdateContent\030( \001(\0132\035.Link" +
      "erCrossRoomUpdateContent\022I\n\034changeMultiP" +
      "kTeamInfoContent\030) \001(\0132#.LinkerChangeMul" +
      "tiPKTeamInfoContent\022?\n\032crossRoomLinkInvi" +
      "teContent\030* \001(\0132\033.CrossRoomLinkInviteCon" +
      "tent\022=\n\031crossRoomLinkReplyContent\030+ \001(\0132" +
      "\032.CrossRoomLinkReplyContent\022K\n crossRoom" +
      "LinkCancelInviteContent\030, \001(\0132!.CrossRoo" +
      "mLinkCancelInviteContent\022A\n\033linkerResume" +
      "AudienceContent\030- \001(\0132\034.LinkerResumeAudi" +
      "enceContent\022?\n\032linkerBattleConnectConten" +
      "t\030. \001(\0132\033.LinkerBattleConnectContent\022;\n\030" +
      "linkerResumeApplyContent\030/ \001(\0132\031.LinkerR" +
      "esumeApplyContent\0229\n\027crossRoomRtcInfoCon" +
      "tent\0300 \001(\0132\030.CrossRoomRTCInfoContent\022K\n " +
      "anchorUpdateLinkmicConfigContent\0301 \001(\0132!" +
      ".AnchorUpdateLinkmicConfigContent\022=\n\031anc" +
      "horUpdateLayoutContent\0302 \001(\0132\032.AnchorUpd" +
      "ateLayoutContent\022=\n\026applyRankChangeConte" +
      "nt\0304 \001(\0132\035.LinkerApplyRankChangeContent\022" +
      "3\n\021sysKickOutContent\030e \001(\0132\030.LinkerSysKi" +
      "ckOutContent\022\026\n\rfallbackScene\030\307\001 \001(\003\022\016\n\005" +
      "extra\030\310\001 \001(\tBG\nCcool.scx.live_room_watch" +
      "er.impl.douyin_hack.proto_entity.webcast" +
      ".imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerInviteContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerReplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCreateContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCloseContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnterContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLeaveContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCancelContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerKickOutContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLinkedListChangeContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerUpdateUserContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerWaitingListChangeContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerBanContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerItemContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerViolationReminderContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerUpdateLinkTypeApplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerUpdateLinkTypeReplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerAvatarAuditContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerApplyExpiredContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerApplyStrongReminderContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerAnchorStreamSwitchContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerClickScreenContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLockPositionContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerFollowStrongGuideContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerShareVideoImContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerGuestInviteContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerGuestExitCastScreenContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerSwitchSceneContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkPhaseEnterNextNotifyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerChangePlayModeContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLowBalanceForPaidLinkmicContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerDegradeAlertContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnlargeGuestInviteContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnlargeGuestReplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkPrepareApplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCrossRoomUpdateContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerChangeMultiPKTeamInfoContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomLinkInviteContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomLinkReplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomLinkCancelInviteContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerResumeAudienceContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerBattleConnectContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerResumeApplyContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomRTCInfoContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.AnchorUpdateLinkmicConfigContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.AnchorUpdateLayoutContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerApplyRankChangeContentOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerSysKickOutContentOuterClass.getDescriptor(),
        });
    internal_static_LinkMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LinkMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_LinkMessage_descriptor,
        new java.lang.String[] { "Common", "MessageType", "LinkerId", "Scene", "InviteContent", "ReplyContent", "CreateContent", "CloseContent", "EnterContent", "LeaveContent", "CancelContent", "KickOutContent", "LinkedListChangeContent", "UpdateUserContent", "WaitingListChangeContent", "BanContent", "ItemContent", "ViolationReminderContent", "UpdateLinkTypeApplyContent", "UpdateLinkTypeReplyContent", "AvatarAuditContent", "ApplyExpiredContent", "ApplyStrongReminderContent", "AnchorStreamSwitchContent", "ClickScreenContent", "LockPositionContent", "FollowStrongGuideContent", "ShareVideoImContent", "GuestInviteContent", "ExitCastScreenContent", "SwitchSceneContent", "LinkPhaseEnterNextContent", "ChangePlayModeContent", "LowBalanceForPaidLinkmicContent", "DegradeAlertContent", "EnlargeGuestInviteContent", "EnlargeGuestReplyContent", "EnlargeGuestApplyContent", "PrepareApplyContent", "CrossRoomUpdateContent", "ChangeMultiPkTeamInfoContent", "CrossRoomLinkInviteContent", "CrossRoomLinkReplyContent", "CrossRoomLinkCancelInviteContent", "LinkerResumeAudienceContent", "LinkerBattleConnectContent", "LinkerResumeApplyContent", "CrossRoomRtcInfoContent", "AnchorUpdateLinkmicConfigContent", "AnchorUpdateLayoutContent", "ApplyRankChangeContent", "SysKickOutContent", "FallbackScene", "Extra", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerInviteContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerReplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCreateContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCloseContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnterContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLeaveContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCancelContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerKickOutContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLinkedListChangeContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerUpdateUserContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerWaitingListChangeContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerBanContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerItemContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerViolationReminderContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerUpdateLinkTypeApplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerUpdateLinkTypeReplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerAvatarAuditContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerApplyExpiredContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerApplyStrongReminderContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerAnchorStreamSwitchContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerClickScreenContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLockPositionContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerFollowStrongGuideContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerShareVideoImContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerGuestInviteContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerGuestExitCastScreenContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerSwitchSceneContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkPhaseEnterNextNotifyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerChangePlayModeContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerLowBalanceForPaidLinkmicContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerDegradeAlertContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnlargeGuestInviteContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnlargeGuestReplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerEnlargeGuestApplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkPrepareApplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerCrossRoomUpdateContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerChangeMultiPKTeamInfoContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomLinkInviteContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomLinkReplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomLinkCancelInviteContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerResumeAudienceContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerBattleConnectContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerResumeApplyContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CrossRoomRTCInfoContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.AnchorUpdateLinkmicConfigContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.AnchorUpdateLayoutContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerApplyRankChangeContentOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LinkerSysKickOutContentOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
