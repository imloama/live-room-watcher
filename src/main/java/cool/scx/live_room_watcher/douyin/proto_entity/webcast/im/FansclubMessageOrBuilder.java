// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/FansclubMessage.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

public interface FansclubMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FansclubMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common commonInfo = 1;</code>
   * @return Whether the commonInfo field is set.
   */
  boolean hasCommonInfo();
  /**
   * <code>.Common commonInfo = 1;</code>
   * @return The commonInfo.
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.Common getCommonInfo();
  /**
   * <code>.Common commonInfo = 1;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOrBuilder getCommonInfoOrBuilder();

  /**
   * <pre>
   * 升级是1，加入是2
   * </pre>
   *
   * <code>int32 type = 2;</code>
   * @return The type.
   */
  int getType();

  /**
   * <code>string content = 3;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>.User user = 4;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.User user = 4;</code>
   * @return The user.
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.User getUser();
  /**
   * <code>.User user = 4;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.UserOrBuilder getUserOrBuilder();
}
