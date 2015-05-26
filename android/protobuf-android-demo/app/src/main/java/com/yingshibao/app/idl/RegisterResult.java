// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yingshibao.proto

package com.yingshibao.app.idl;

/**
 * Protobuf type {@code yingshibao.RegisterResult}
 *
 * <pre>
 * 用户注册响应信息
 * </pre>
 */
public final class RegisterResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:yingshibao.RegisterResult)
    RegisterResultOrBuilder {
  // Use RegisterResult.newBuilder() to construct.
  private RegisterResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private RegisterResult(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final RegisterResult defaultInstance;
  public static RegisterResult getDefaultInstance() {
    return defaultInstance;
  }

  public RegisterResult getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            errorMessage_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            userId_ = input.readInt32();
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            sessionId_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.yingshibao.app.idl.Yingshibao.internal_static_yingshibao_RegisterResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yingshibao.app.idl.Yingshibao.internal_static_yingshibao_RegisterResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yingshibao.app.idl.RegisterResult.class, com.yingshibao.app.idl.RegisterResult.Builder.class);
  }

  public static com.google.protobuf.Parser<RegisterResult> PARSER =
      new com.google.protobuf.AbstractParser<RegisterResult>() {
    public RegisterResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisterResult(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterResult> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int ERRORMESSAGE_FIELD_NUMBER = 1;
  private java.lang.Object errorMessage_;
  /**
   * <code>required string errorMessage = 1;</code>
   *
   * <pre>
   * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
   * </pre>
   */
  public boolean hasErrorMessage() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required string errorMessage = 1;</code>
   *
   * <pre>
   * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
   * </pre>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        errorMessage_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string errorMessage = 1;</code>
   *
   * <pre>
   * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
   * </pre>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 2;
  private int userId_;
  /**
   * <code>optional int32 userId = 2;</code>
   *
   * <pre>
   * 用户ID，注册成功时存放服务器生成的userId。
   * </pre>
   */
  public boolean hasUserId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 userId = 2;</code>
   *
   * <pre>
   * 用户ID，注册成功时存放服务器生成的userId。
   * </pre>
   */
  public int getUserId() {
    return userId_;
  }

  public static final int SESSIONID_FIELD_NUMBER = 3;
  private java.lang.Object sessionId_;
  /**
   * <code>optional string sessionId = 3;</code>
   *
   * <pre>
   * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
   * </pre>
   */
  public boolean hasSessionId() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string sessionId = 3;</code>
   *
   * <pre>
   * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
   * </pre>
   */
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        sessionId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string sessionId = 3;</code>
   *
   * <pre>
   * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
   * </pre>
   */
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    errorMessage_ = "";
    userId_ = 0;
    sessionId_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasErrorMessage()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(1, getErrorMessageBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, userId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getSessionIdBytes());
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getErrorMessageBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getSessionIdBytes());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static com.yingshibao.app.idl.RegisterResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yingshibao.app.idl.RegisterResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yingshibao.app.idl.RegisterResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yingshibao.app.idl.RegisterResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yingshibao.app.idl.RegisterResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.yingshibao.app.idl.RegisterResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.yingshibao.app.idl.RegisterResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.yingshibao.app.idl.RegisterResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.yingshibao.app.idl.RegisterResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.yingshibao.app.idl.RegisterResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.yingshibao.app.idl.RegisterResult prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code yingshibao.RegisterResult}
   *
   * <pre>
   * 用户注册响应信息
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:yingshibao.RegisterResult)
      com.yingshibao.app.idl.RegisterResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yingshibao.app.idl.Yingshibao.internal_static_yingshibao_RegisterResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yingshibao.app.idl.Yingshibao.internal_static_yingshibao_RegisterResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yingshibao.app.idl.RegisterResult.class, com.yingshibao.app.idl.RegisterResult.Builder.class);
    }

    // Construct using com.yingshibao.app.idl.RegisterResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      errorMessage_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      userId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      sessionId_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yingshibao.app.idl.Yingshibao.internal_static_yingshibao_RegisterResult_descriptor;
    }

    public com.yingshibao.app.idl.RegisterResult getDefaultInstanceForType() {
      return com.yingshibao.app.idl.RegisterResult.getDefaultInstance();
    }

    public com.yingshibao.app.idl.RegisterResult build() {
      com.yingshibao.app.idl.RegisterResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.yingshibao.app.idl.RegisterResult buildPartial() {
      com.yingshibao.app.idl.RegisterResult result = new com.yingshibao.app.idl.RegisterResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.errorMessage_ = errorMessage_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.userId_ = userId_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.sessionId_ = sessionId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.yingshibao.app.idl.RegisterResult) {
        return mergeFrom((com.yingshibao.app.idl.RegisterResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yingshibao.app.idl.RegisterResult other) {
      if (other == com.yingshibao.app.idl.RegisterResult.getDefaultInstance()) return this;
      if (other.hasErrorMessage()) {
        bitField0_ |= 0x00000001;
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (other.hasUserId()) {
        setUserId(other.getUserId());
      }
      if (other.hasSessionId()) {
        bitField0_ |= 0x00000004;
        sessionId_ = other.sessionId_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasErrorMessage()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.yingshibao.app.idl.RegisterResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yingshibao.app.idl.RegisterResult) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>required string errorMessage = 1;</code>
     *
     * <pre>
     * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
     * </pre>
     */
    public boolean hasErrorMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string errorMessage = 1;</code>
     *
     * <pre>
     * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
     * </pre>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorMessage_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string errorMessage = 1;</code>
     *
     * <pre>
     * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
     * </pre>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string errorMessage = 1;</code>
     *
     * <pre>
     * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
     * </pre>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string errorMessage = 1;</code>
     *
     * <pre>
     * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
     * </pre>
     */
    public Builder clearErrorMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>required string errorMessage = 1;</code>
     *
     * <pre>
     * 错误信息，如果注册成功为null；如果发生错误，存放导致错误的原因。
     * </pre>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      errorMessage_ = value;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>optional int32 userId = 2;</code>
     *
     * <pre>
     * 用户ID，注册成功时存放服务器生成的userId。
     * </pre>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 userId = 2;</code>
     *
     * <pre>
     * 用户ID，注册成功时存放服务器生成的userId。
     * </pre>
     */
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>optional int32 userId = 2;</code>
     *
     * <pre>
     * 用户ID，注册成功时存放服务器生成的userId。
     * </pre>
     */
    public Builder setUserId(int value) {
      bitField0_ |= 0x00000002;
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 userId = 2;</code>
     *
     * <pre>
     * 用户ID，注册成功时存放服务器生成的userId。
     * </pre>
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>optional string sessionId = 3;</code>
     *
     * <pre>
     * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
     * </pre>
     */
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string sessionId = 3;</code>
     *
     * <pre>
     * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
     * </pre>
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sessionId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string sessionId = 3;</code>
     *
     * <pre>
     * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sessionId = 3;</code>
     *
     * <pre>
     * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
     * </pre>
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sessionId = 3;</code>
     *
     * <pre>
     * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
     * </pre>
     */
    public Builder clearSessionId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string sessionId = 3;</code>
     *
     * <pre>
     * sessionId，注册成功时自动登录了，存放服务器生成的sessionId。
     * </pre>
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      sessionId_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:yingshibao.RegisterResult)
  }

  static {
    defaultInstance = new RegisterResult(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:yingshibao.RegisterResult)
}
