// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/data/Room.proto
// Protobuf Java Version: 4.29.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

/**
 * <pre>
 * 更新时间 : 2024-07-03
 * </pre>
 *
 * Protobuf type {@code Room}
 */
public final class Room extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Room)
    RoomOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      Room.class.getName());
  }
  // Use Room.newBuilder() to construct.
  private Room(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Room() {
    idStr_ = "";
    title_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOuterClass.internal_static_Room_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOuterClass.internal_static_Room_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int ID_STR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object idStr_ = "";
  /**
   * <code>string id_str = 2;</code>
   * @return The idStr.
   */
  @java.lang.Override
  public java.lang.String getIdStr() {
    java.lang.Object ref = idStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idStr_ = s;
      return s;
    }
  }
  /**
   * <code>string id_str = 2;</code>
   * @return The bytes for idStr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdStrBytes() {
    java.lang.Object ref = idStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idStr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private long status_ = 0L;
  /**
   * <code>int64 status = 3;</code>
   * @return The status.
   */
  @java.lang.Override
  public long getStatus() {
    return status_;
  }

  public static final int OWNER_USER_ID_FIELD_NUMBER = 4;
  private long ownerUserId_ = 0L;
  /**
   * <code>int64 owner_user_id = 4;</code>
   * @return The ownerUserId.
   */
  @java.lang.Override
  public long getOwnerUserId() {
    return ownerUserId_;
  }

  public static final int TITLE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 5;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 5;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_COUNT_FIELD_NUMBER = 6;
  private long userCount_ = 0L;
  /**
   * <code>int64 user_count = 6;</code>
   * @return The userCount.
   */
  @java.lang.Override
  public long getUserCount() {
    return userCount_;
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 7;
  private long createTime_ = 0L;
  /**
   * <code>int64 create_time = 7;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public long getCreateTime() {
    return createTime_;
  }

  public static final int LIVE_ID_FIELD_NUMBER = 14;
  private long liveId_ = 0L;
  /**
   * <code>int64 live_id = 14;</code>
   * @return The liveId.
   */
  @java.lang.Override
  public long getLiveId() {
    return liveId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(idStr_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, idStr_);
    }
    if (status_ != 0L) {
      output.writeInt64(3, status_);
    }
    if (ownerUserId_ != 0L) {
      output.writeInt64(4, ownerUserId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, title_);
    }
    if (userCount_ != 0L) {
      output.writeInt64(6, userCount_);
    }
    if (createTime_ != 0L) {
      output.writeInt64(7, createTime_);
    }
    if (liveId_ != 0L) {
      output.writeInt64(14, liveId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(idStr_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, idStr_);
    }
    if (status_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, status_);
    }
    if (ownerUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, ownerUserId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, title_);
    }
    if (userCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, userCount_);
    }
    if (createTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, createTime_);
    }
    if (liveId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(14, liveId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room other = (cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room) obj;

    if (getId()
        != other.getId()) return false;
    if (!getIdStr()
        .equals(other.getIdStr())) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (getOwnerUserId()
        != other.getOwnerUserId()) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (getUserCount()
        != other.getUserCount()) return false;
    if (getCreateTime()
        != other.getCreateTime()) return false;
    if (getLiveId()
        != other.getLiveId()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + ID_STR_FIELD_NUMBER;
    hash = (53 * hash) + getIdStr().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStatus());
    hash = (37 * hash) + OWNER_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOwnerUserId());
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + USER_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserCount());
    hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreateTime());
    hash = (37 * hash) + LIVE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLiveId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 更新时间 : 2024-07-03
   * </pre>
   *
   * Protobuf type {@code Room}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Room)
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOuterClass.internal_static_Room_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOuterClass.internal_static_Room_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0L;
      idStr_ = "";
      status_ = 0L;
      ownerUserId_ = 0L;
      title_ = "";
      userCount_ = 0L;
      createTime_ = 0L;
      liveId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.RoomOuterClass.internal_static_Room_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room build() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room buildPartial() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room result = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.idStr_ = idStr_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ownerUserId_ = ownerUserId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.userCount_ = userCount_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.createTime_ = createTime_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.liveId_ = liveId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room) {
        return mergeFrom((cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room other) {
      if (other == cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getIdStr().isEmpty()) {
        idStr_ = other.idStr_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getStatus() != 0L) {
        setStatus(other.getStatus());
      }
      if (other.getOwnerUserId() != 0L) {
        setOwnerUserId(other.getOwnerUserId());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getUserCount() != 0L) {
        setUserCount(other.getUserCount());
      }
      if (other.getCreateTime() != 0L) {
        setCreateTime(other.getCreateTime());
      }
      if (other.getLiveId() != 0L) {
        setLiveId(other.getLiveId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              idStr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              status_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              ownerUserId_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              userCount_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              createTime_ = input.readInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 112: {
              liveId_ = input.readInt64();
              bitField0_ |= 0x00000080;
              break;
            } // case 112
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object idStr_ = "";
    /**
     * <code>string id_str = 2;</code>
     * @return The idStr.
     */
    public java.lang.String getIdStr() {
      java.lang.Object ref = idStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idStr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id_str = 2;</code>
     * @return The bytes for idStr.
     */
    public com.google.protobuf.ByteString
        getIdStrBytes() {
      java.lang.Object ref = idStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id_str = 2;</code>
     * @param value The idStr to set.
     * @return This builder for chaining.
     */
    public Builder setIdStr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      idStr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string id_str = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdStr() {
      idStr_ = getDefaultInstance().getIdStr();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string id_str = 2;</code>
     * @param value The bytes for idStr to set.
     * @return This builder for chaining.
     */
    public Builder setIdStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      idStr_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long status_ ;
    /**
     * <code>int64 status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public long getStatus() {
      return status_;
    }
    /**
     * <code>int64 status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(long value) {

      status_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = 0L;
      onChanged();
      return this;
    }

    private long ownerUserId_ ;
    /**
     * <code>int64 owner_user_id = 4;</code>
     * @return The ownerUserId.
     */
    @java.lang.Override
    public long getOwnerUserId() {
      return ownerUserId_;
    }
    /**
     * <code>int64 owner_user_id = 4;</code>
     * @param value The ownerUserId to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerUserId(long value) {

      ownerUserId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 owner_user_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOwnerUserId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ownerUserId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 5;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 5;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 5;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 5;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private long userCount_ ;
    /**
     * <code>int64 user_count = 6;</code>
     * @return The userCount.
     */
    @java.lang.Override
    public long getUserCount() {
      return userCount_;
    }
    /**
     * <code>int64 user_count = 6;</code>
     * @param value The userCount to set.
     * @return This builder for chaining.
     */
    public Builder setUserCount(long value) {

      userCount_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int64 user_count = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserCount() {
      bitField0_ = (bitField0_ & ~0x00000020);
      userCount_ = 0L;
      onChanged();
      return this;
    }

    private long createTime_ ;
    /**
     * <code>int64 create_time = 7;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public long getCreateTime() {
      return createTime_;
    }
    /**
     * <code>int64 create_time = 7;</code>
     * @param value The createTime to set.
     * @return This builder for chaining.
     */
    public Builder setCreateTime(long value) {

      createTime_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>int64 create_time = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000040);
      createTime_ = 0L;
      onChanged();
      return this;
    }

    private long liveId_ ;
    /**
     * <code>int64 live_id = 14;</code>
     * @return The liveId.
     */
    @java.lang.Override
    public long getLiveId() {
      return liveId_;
    }
    /**
     * <code>int64 live_id = 14;</code>
     * @param value The liveId to set.
     * @return This builder for chaining.
     */
    public Builder setLiveId(long value) {

      liveId_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <code>int64 live_id = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearLiveId() {
      bitField0_ = (bitField0_ & ~0x00000080);
      liveId_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Room)
  }

  // @@protoc_insertion_point(class_scope:Room)
  private static final cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room();
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Room>
      PARSER = new com.google.protobuf.AbstractParser<Room>() {
    @java.lang.Override
    public Room parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Room> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Room> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Room getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

