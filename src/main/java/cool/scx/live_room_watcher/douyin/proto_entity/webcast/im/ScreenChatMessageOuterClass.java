// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/ScreenChatMessage.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

public final class ScreenChatMessageOuterClass {
  private ScreenChatMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScreenChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScreenChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScreenChatMessage_OfficialCommentConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScreenChatMessage_OfficialCommentConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScreenChatMessage_Effect_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScreenChatMessage_Effect_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"webcast/im/ScreenChatMessage.proto\032\027we" +
      "bcast/im/Common.proto\032!webcast/im/Public" +
      "AreaCommon.proto\032\027webcast/data/User.prot" +
      "o\032\030webcast/data/Image.proto\032\027webcast/dat" +
      "a/Text.proto\032\037webcast/data/ChatIdentity." +
      "proto\032 webcast/im/FlexImageStruct.proto\"" +
      "\203\005\n\021ScreenChatMessage\022\027\n\006common\030\001 \001(\0132\007." +
      "Common\022\023\n\004user\030\002 \001(\0132\005.User\022\026\n\016screenCha" +
      "tType\030\003 \001(\003\022\017\n\007content\030\004 \001(\t\022\020\n\010priority" +
      "\030\005 \001(\003\022)\n\006effect\030\006 \001(\0132\031.ScreenChatMessa" +
      "ge.Effect\022\037\n\017backgroundImage\030\007 \001(\0132\006.Ima" +
      "ge\022+\n\010effectV2\030\010 \001(\0132\031.ScreenChatMessage" +
      ".Effect\022!\n\021backgroundImageV2\030\t \001(\0132\006.Ima" +
      "ge\022+\n\020publicAreaCommon\030\n \001(\0132\021.PublicAre" +
      "aCommon\022G\n\025officialCommentConfig\030\013 \001(\0132(" +
      ".ScreenChatMessage.OfficialCommentConfig" +
      "\022\021\n\teventTime\030\014 \001(\003\022\022\n\nsendReview\030\r \001(\010\022" +
      "\'\n\020chatIdentityInfo\030\016 \001(\0132\r.ChatIdentity" +
      "\022\031\n\nrtfContent\030\036 \001(\0132\005.Text\032)\n\025OfficialC" +
      "ommentConfig\022\020\n\010official\030\001 \001(\010\032]\n\006Effect" +
      "\022\036\n\004icon\030\001 \001(\0132\020.FlexImageStruct\022\032\n\navat" +
      "arIcon\030\002 \001(\0132\006.Image\022\027\n\017backgroundColor\030" +
      "\003 \001(\tB=\n9cool.scx.live_room_watcher.douy" +
      "in.proto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.PublicAreaCommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.TextOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.ChatIdentityOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOuterClass.getDescriptor(),
        });
    internal_static_ScreenChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScreenChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScreenChatMessage_descriptor,
        new java.lang.String[] { "Common", "User", "ScreenChatType", "Content", "Priority", "Effect", "BackgroundImage", "EffectV2", "BackgroundImageV2", "PublicAreaCommon", "OfficialCommentConfig", "EventTime", "SendReview", "ChatIdentityInfo", "RtfContent", });
    internal_static_ScreenChatMessage_OfficialCommentConfig_descriptor =
      internal_static_ScreenChatMessage_descriptor.getNestedTypes().get(0);
    internal_static_ScreenChatMessage_OfficialCommentConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScreenChatMessage_OfficialCommentConfig_descriptor,
        new java.lang.String[] { "Official", });
    internal_static_ScreenChatMessage_Effect_descriptor =
      internal_static_ScreenChatMessage_descriptor.getNestedTypes().get(1);
    internal_static_ScreenChatMessage_Effect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScreenChatMessage_Effect_descriptor,
        new java.lang.String[] { "Icon", "AvatarIcon", "BackgroundColor", });
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.PublicAreaCommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.TextOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.ChatIdentityOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.FlexImageStructOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
