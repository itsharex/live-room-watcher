// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/im/ControlMessage.proto
// Protobuf Java Version: 4.27.3

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

/**
 * <pre>
 * 更新时间 : 2024-07-03
 * </pre>
 *
 * Protobuf type {@code ControlMessage}
 */
public final class ControlMessage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ControlMessage)
    ControlMessageOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      ControlMessage.class.getName());
  }
  // Use ControlMessage.newBuilder() to construct.
  private ControlMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ControlMessage() {
    tips_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessageOuterClass.internal_static_ControlMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessageOuterClass.internal_static_ControlMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.Builder.class);
  }

  private int bitField0_;
  public static final int COMMON_FIELD_NUMBER = 1;
  private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common common_;
  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon() {
    return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
  }
  /**
   * <code>.Common common = 1;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder() {
    return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private long action_ = 0L;
  /**
   * <code>int64 action = 2;</code>
   * @return The action.
   */
  @java.lang.Override
  public long getAction() {
    return action_;
  }

  public static final int TIPS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tips_ = "";
  /**
   * <code>string tips = 3;</code>
   * @return The tips.
   */
  @java.lang.Override
  public java.lang.String getTips() {
    java.lang.Object ref = tips_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tips_ = s;
      return s;
    }
  }
  /**
   * <code>string tips = 3;</code>
   * @return The bytes for tips.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTipsBytes() {
    java.lang.Object ref = tips_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tips_ = b;
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
      output.writeMessage(1, getCommon());
    }
    if (action_ != 0L) {
      output.writeInt64(2, action_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(tips_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, tips_);
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
        .computeMessageSize(1, getCommon());
    }
    if (action_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, action_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(tips_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, tips_);
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
    if (!(obj instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage other = (cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (getAction()
        != other.getAction()) return false;
    if (!getTips()
        .equals(other.getTips())) return false;
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAction());
    hash = (37 * hash) + TIPS_FIELD_NUMBER;
    hash = (53 * hash) + getTips().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage prototype) {
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
   * Protobuf type {@code ControlMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ControlMessage)
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessageOuterClass.internal_static_ControlMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessageOuterClass.internal_static_ControlMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.newBuilder()
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
        getCommonFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      action_ = 0L;
      tips_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessageOuterClass.internal_static_ControlMessage_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage build() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage buildPartial() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage result = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = commonBuilder_ == null
            ? common_
            : commonBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tips_ = tips_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage) {
        return mergeFrom((cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage other) {
      if (other == cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (other.getAction() != 0L) {
        setAction(other.getAction());
      }
      if (!other.getTips().isEmpty()) {
        tips_ = other.tips_;
        bitField0_ |= 0x00000004;
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
                  getCommonFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              action_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              tips_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common common_;
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder> commonBuilder_;
    /**
     * <code>.Common common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Common common = 1;</code>
     * @return The common.
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
      } else {
        commonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder mergeCommon(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common value) {
      if (commonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          common_ != null &&
          common_ != cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance()) {
          getCommonBuilder().mergeFrom(value);
        } else {
          common_ = value;
        }
      } else {
        commonBuilder_.mergeFrom(value);
      }
      if (common_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder clearCommon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder getCommonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private long action_ ;
    /**
     * <code>int64 action = 2;</code>
     * @return The action.
     */
    @java.lang.Override
    public long getAction() {
      return action_;
    }
    /**
     * <code>int64 action = 2;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(long value) {

      action_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 action = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000002);
      action_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object tips_ = "";
    /**
     * <code>string tips = 3;</code>
     * @return The tips.
     */
    public java.lang.String getTips() {
      java.lang.Object ref = tips_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tips_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tips = 3;</code>
     * @return The bytes for tips.
     */
    public com.google.protobuf.ByteString
        getTipsBytes() {
      java.lang.Object ref = tips_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tips_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tips = 3;</code>
     * @param value The tips to set.
     * @return This builder for chaining.
     */
    public Builder setTips(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tips_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string tips = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTips() {
      tips_ = getDefaultInstance().getTips();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string tips = 3;</code>
     * @param value The bytes for tips to set.
     * @return This builder for chaining.
     */
    public Builder setTipsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tips_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ControlMessage)
  }

  // @@protoc_insertion_point(class_scope:ControlMessage)
  private static final cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage();
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ControlMessage>
      PARSER = new com.google.protobuf.AbstractParser<ControlMessage>() {
    @java.lang.Override
    public ControlMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<ControlMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControlMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.ControlMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

