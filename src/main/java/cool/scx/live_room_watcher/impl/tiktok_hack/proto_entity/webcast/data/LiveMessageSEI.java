// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tiktok_hack/webcast/data/LiveMessageSEI.proto
// Protobuf Java Version: 4.27.3

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data;

/**
 * <pre>
 * 更新时间 2024-04-29
 * </pre>
 *
 * Protobuf type {@code tiktok_hack.LiveMessageSEI}
 */
public final class LiveMessageSEI extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tiktok_hack.LiveMessageSEI)
    LiveMessageSEIOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      LiveMessageSEI.class.getName());
  }
  // Use LiveMessageSEI.newBuilder() to construct.
  private LiveMessageSEI(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LiveMessageSEI() {
    timestamp_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEIOuterClass.internal_static_tiktok_hack_LiveMessageSEI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEIOuterClass.internal_static_tiktok_hack_LiveMessageSEI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI.class, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI.Builder.class);
  }

  private int bitField0_;
  public static final int UNIQUEID_FIELD_NUMBER = 1;
  private cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID uniqueId_;
  /**
   * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
   * @return Whether the uniqueId field is set.
   */
  @java.lang.Override
  public boolean hasUniqueId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
   * @return The uniqueId.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID getUniqueId() {
    return uniqueId_ == null ? cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.getDefaultInstance() : uniqueId_;
  }
  /**
   * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOrBuilder getUniqueIdOrBuilder() {
    return uniqueId_ == null ? cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.getDefaultInstance() : uniqueId_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object timestamp_ = "";
  /**
   * <code>string timestamp = 2;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <code>string timestamp = 2;</code>
   * @return The bytes for timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUniqueId());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(timestamp_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUniqueId());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(timestamp_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, timestamp_);
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
    if (!(obj instanceof cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI other = (cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI) obj;

    if (hasUniqueId() != other.hasUniqueId()) return false;
    if (hasUniqueId()) {
      if (!getUniqueId()
          .equals(other.getUniqueId())) return false;
    }
    if (!getTimestamp()
        .equals(other.getTimestamp())) return false;
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
    if (hasUniqueId()) {
      hash = (37 * hash) + UNIQUEID_FIELD_NUMBER;
      hash = (53 * hash) + getUniqueId().hashCode();
    }
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI prototype) {
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
   * 更新时间 2024-04-29
   * </pre>
   *
   * Protobuf type {@code tiktok_hack.LiveMessageSEI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tiktok_hack.LiveMessageSEI)
      cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEIOuterClass.internal_static_tiktok_hack_LiveMessageSEI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEIOuterClass.internal_static_tiktok_hack_LiveMessageSEI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI.class, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getUniqueIdFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uniqueId_ = null;
      if (uniqueIdBuilder_ != null) {
        uniqueIdBuilder_.dispose();
        uniqueIdBuilder_ = null;
      }
      timestamp_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEIOuterClass.internal_static_tiktok_hack_LiveMessageSEI_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI build() {
      cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI buildPartial() {
      cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI result = new cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uniqueId_ = uniqueIdBuilder_ == null
            ? uniqueId_
            : uniqueIdBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestamp_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI) {
        return mergeFrom((cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI other) {
      if (other == cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI.getDefaultInstance()) return this;
      if (other.hasUniqueId()) {
        mergeUniqueId(other.getUniqueId());
      }
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10: {
              input.readMessage(
                  getUniqueIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              timestamp_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID uniqueId_;
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.Builder, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOrBuilder> uniqueIdBuilder_;
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     * @return Whether the uniqueId field is set.
     */
    public boolean hasUniqueId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     * @return The uniqueId.
     */
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID getUniqueId() {
      if (uniqueIdBuilder_ == null) {
        return uniqueId_ == null ? cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.getDefaultInstance() : uniqueId_;
      } else {
        return uniqueIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     */
    public Builder setUniqueId(cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID value) {
      if (uniqueIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uniqueId_ = value;
      } else {
        uniqueIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     */
    public Builder setUniqueId(
        cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.Builder builderForValue) {
      if (uniqueIdBuilder_ == null) {
        uniqueId_ = builderForValue.build();
      } else {
        uniqueIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     */
    public Builder mergeUniqueId(cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID value) {
      if (uniqueIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          uniqueId_ != null &&
          uniqueId_ != cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.getDefaultInstance()) {
          getUniqueIdBuilder().mergeFrom(value);
        } else {
          uniqueId_ = value;
        }
      } else {
        uniqueIdBuilder_.mergeFrom(value);
      }
      if (uniqueId_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     */
    public Builder clearUniqueId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      uniqueId_ = null;
      if (uniqueIdBuilder_ != null) {
        uniqueIdBuilder_.dispose();
        uniqueIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.Builder getUniqueIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUniqueIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOrBuilder getUniqueIdOrBuilder() {
      if (uniqueIdBuilder_ != null) {
        return uniqueIdBuilder_.getMessageOrBuilder();
      } else {
        return uniqueId_ == null ?
            cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.getDefaultInstance() : uniqueId_;
      }
    }
    /**
     * <code>.tiktok_hack.LiveMessageID uniqueId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.Builder, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOrBuilder> 
        getUniqueIdFieldBuilder() {
      if (uniqueIdBuilder_ == null) {
        uniqueIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageID.Builder, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOrBuilder>(
                getUniqueId(),
                getParentForChildren(),
                isClean());
        uniqueId_ = null;
      }
      return uniqueIdBuilder_;
    }

    private java.lang.Object timestamp_ = "";
    /**
     * <code>string timestamp = 2;</code>
     * @return The timestamp.
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timestamp = 2;</code>
     * @return The bytes for timestamp.
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timestamp = 2;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      timestamp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      timestamp_ = getDefaultInstance().getTimestamp();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 2;</code>
     * @param value The bytes for timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      timestamp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tiktok_hack.LiveMessageSEI)
  }

  // @@protoc_insertion_point(class_scope:tiktok_hack.LiveMessageSEI)
  private static final cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI();
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LiveMessageSEI>
      PARSER = new com.google.protobuf.AbstractParser<LiveMessageSEI>() {
    @java.lang.Override
    public LiveMessageSEI parsePartialFrom(
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

  public static com.google.protobuf.Parser<LiveMessageSEI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LiveMessageSEI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageSEI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

