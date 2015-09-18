// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb_message.proto

package com.argo.qpush.protobuf;

/**
 * Protobuf type {@code message.PBAPNSEvent}
 */
public  final class PBAPNSEvent extends
    com.google.protobuf.GeneratedMessage
    implements PBAPNSEventOrBuilder {
  // Use PBAPNSEvent.newBuilder() to construct.
  private PBAPNSEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private PBAPNSEvent(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final PBAPNSEvent defaultInstance;
  public static PBAPNSEvent getDefaultInstance() {
    return defaultInstance;
  }

  public PBAPNSEvent getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private PBAPNSEvent(
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
          case 8: {
            bitField0_ |= 0x00000001;
            op_ = input.readInt32();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            token_ = input.readBytes();
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            appKey_ = input.readBytes();
            break;
          }
          case 34: {
            bitField0_ |= 0x00000008;
            userId_ = input.readBytes();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            typeId_ = input.readInt32();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            read_ = input.readInt32();
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
    return com.argo.qpush.protobuf.PbMessage.internal_static_message_PBAPNSEvent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.argo.qpush.protobuf.PbMessage.internal_static_message_PBAPNSEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.argo.qpush.protobuf.PBAPNSEvent.class, com.argo.qpush.protobuf.PBAPNSEvent.Builder.class);
  }

  public static com.google.protobuf.Parser<PBAPNSEvent> PARSER =
      new com.google.protobuf.AbstractParser<PBAPNSEvent>() {
    public PBAPNSEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PBAPNSEvent(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PBAPNSEvent> getParserForType() {
    return PARSER;
  }

  /**
   * Protobuf enum {@code message.PBAPNSEvent.Ops}
   */
  public enum Ops
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Online = 1;</code>
     */
    Online(0, 1),
    /**
     * <code>KeepAlive = 2;</code>
     */
    KeepAlive(1, 2),
    /**
     * <code>PushAck = 3;</code>
     */
    PushAck(2, 3),
    /**
     * <code>Offline = 4;</code>
     */
    Offline(3, 4),
    /**
     * <code>Error = 0;</code>
     */
    Error(4, 0),
    /**
     * <code>Sleep = 5;</code>
     */
    Sleep(5, 5),
    /**
     * <code>Awake = 6;</code>
     */
    Awake(6, 6),
    ;

    /**
     * <code>Online = 1;</code>
     */
    public static final int Online_VALUE = 1;
    /**
     * <code>KeepAlive = 2;</code>
     */
    public static final int KeepAlive_VALUE = 2;
    /**
     * <code>PushAck = 3;</code>
     */
    public static final int PushAck_VALUE = 3;
    /**
     * <code>Offline = 4;</code>
     */
    public static final int Offline_VALUE = 4;
    /**
     * <code>Error = 0;</code>
     */
    public static final int Error_VALUE = 0;
    /**
     * <code>Sleep = 5;</code>
     */
    public static final int Sleep_VALUE = 5;
    /**
     * <code>Awake = 6;</code>
     */
    public static final int Awake_VALUE = 6;


    public final int getNumber() { return value; }

    public static Ops valueOf(int value) {
      switch (value) {
        case 1: return Online;
        case 2: return KeepAlive;
        case 3: return PushAck;
        case 4: return Offline;
        case 0: return Error;
        case 5: return Sleep;
        case 6: return Awake;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Ops>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Ops>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Ops>() {
            public Ops findValueByNumber(int number) {
              return Ops.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.argo.qpush.protobuf.PBAPNSEvent.getDescriptor().getEnumTypes().get(0);
    }

    private static final Ops[] VALUES = values();

    public static Ops valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Ops(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.PBAPNSEvent.Ops)
  }

  /**
   * Protobuf enum {@code message.PBAPNSEvent.DeviceTypes}
   */
  public enum DeviceTypes
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>iPhone = 1;</code>
     */
    iPhone(0, 1),
    /**
     * <code>iPad = 2;</code>
     */
    iPad(1, 2),
    /**
     * <code>Android = 3;</code>
     */
    Android(2, 3),
    ;

    /**
     * <code>iPhone = 1;</code>
     */
    public static final int iPhone_VALUE = 1;
    /**
     * <code>iPad = 2;</code>
     */
    public static final int iPad_VALUE = 2;
    /**
     * <code>Android = 3;</code>
     */
    public static final int Android_VALUE = 3;


    public final int getNumber() { return value; }

    public static DeviceTypes valueOf(int value) {
      switch (value) {
        case 1: return iPhone;
        case 2: return iPad;
        case 3: return Android;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeviceTypes>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<DeviceTypes>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeviceTypes>() {
            public DeviceTypes findValueByNumber(int number) {
              return DeviceTypes.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.argo.qpush.protobuf.PBAPNSEvent.getDescriptor().getEnumTypes().get(1);
    }

    private static final DeviceTypes[] VALUES = values();

    public static DeviceTypes valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private DeviceTypes(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:message.PBAPNSEvent.DeviceTypes)
  }

  private int bitField0_;
  // required int32 op = 1;
  public static final int OP_FIELD_NUMBER = 1;
  private int op_;
  /**
   * <code>required int32 op = 1;</code>
   */
  public boolean hasOp() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required int32 op = 1;</code>
   */
  public int getOp() {
    return op_;
  }

  // required string token = 2;
  public static final int TOKEN_FIELD_NUMBER = 2;
  private java.lang.Object token_;
  /**
   * <code>required string token = 2;</code>
   */
  public boolean hasToken() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required string token = 2;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        token_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // required string appKey = 3;
  public static final int APPKEY_FIELD_NUMBER = 3;
  private java.lang.Object appKey_;
  /**
   * <code>required string appKey = 3;</code>
   */
  public boolean hasAppKey() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required string appKey = 3;</code>
   */
  public java.lang.String getAppKey() {
    java.lang.Object ref = appKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        appKey_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string appKey = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAppKeyBytes() {
    java.lang.Object ref = appKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // required string userId = 4;
  public static final int USERID_FIELD_NUMBER = 4;
  private java.lang.Object userId_;
  /**
   * <code>required string userId = 4;</code>
   */
  public boolean hasUserId() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>required string userId = 4;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        userId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string userId = 4;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // required int32 typeId = 5;
  public static final int TYPEID_FIELD_NUMBER = 5;
  private int typeId_;
  /**
   * <code>required int32 typeId = 5;</code>
   */
  public boolean hasTypeId() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>required int32 typeId = 5;</code>
   */
  public int getTypeId() {
    return typeId_;
  }

  // optional int32 read = 6;
  public static final int READ_FIELD_NUMBER = 6;
  private int read_;
  /**
   * <code>optional int32 read = 6;</code>
   */
  public boolean hasRead() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional int32 read = 6;</code>
   */
  public int getRead() {
    return read_;
  }

  private void initFields() {
    op_ = 0;
    token_ = "";
    appKey_ = "";
    userId_ = "";
    typeId_ = 0;
    read_ = 0;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;

    if (!hasOp()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasToken()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasAppKey()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasUserId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTypeId()) {
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
      output.writeInt32(1, op_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getTokenBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getAppKeyBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBytes(4, getUserIdBytes());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt32(5, typeId_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeInt32(6, read_);
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
        .computeInt32Size(1, op_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getTokenBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getAppKeyBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, getUserIdBytes());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, typeId_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, read_);
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

  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.argo.qpush.protobuf.PBAPNSEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.argo.qpush.protobuf.PBAPNSEvent prototype) {
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
   * Protobuf type {@code message.PBAPNSEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.argo.qpush.protobuf.PBAPNSEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.argo.qpush.protobuf.PbMessage.internal_static_message_PBAPNSEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.argo.qpush.protobuf.PbMessage.internal_static_message_PBAPNSEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.argo.qpush.protobuf.PBAPNSEvent.class, com.argo.qpush.protobuf.PBAPNSEvent.Builder.class);
    }

    // Construct using com.argo.qpush.protobuf.PBAPNSEvent.newBuilder()
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
      op_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      token_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      appKey_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      userId_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      typeId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      read_ = 0;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.argo.qpush.protobuf.PbMessage.internal_static_message_PBAPNSEvent_descriptor;
    }

    public com.argo.qpush.protobuf.PBAPNSEvent getDefaultInstanceForType() {
      return com.argo.qpush.protobuf.PBAPNSEvent.getDefaultInstance();
    }

    public com.argo.qpush.protobuf.PBAPNSEvent build() {
      com.argo.qpush.protobuf.PBAPNSEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.argo.qpush.protobuf.PBAPNSEvent buildPartial() {
      com.argo.qpush.protobuf.PBAPNSEvent result = new com.argo.qpush.protobuf.PBAPNSEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.op_ = op_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.token_ = token_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.appKey_ = appKey_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.userId_ = userId_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.typeId_ = typeId_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000020;
      }
      result.read_ = read_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.argo.qpush.protobuf.PBAPNSEvent) {
        return mergeFrom((com.argo.qpush.protobuf.PBAPNSEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.argo.qpush.protobuf.PBAPNSEvent other) {
      if (other == com.argo.qpush.protobuf.PBAPNSEvent.getDefaultInstance()) return this;
      if (other.hasOp()) {
        setOp(other.getOp());
      }
      if (other.hasToken()) {
        bitField0_ |= 0x00000002;
        token_ = other.token_;
        onChanged();
      }
      if (other.hasAppKey()) {
        bitField0_ |= 0x00000004;
        appKey_ = other.appKey_;
        onChanged();
      }
      if (other.hasUserId()) {
        bitField0_ |= 0x00000008;
        userId_ = other.userId_;
        onChanged();
      }
      if (other.hasTypeId()) {
        setTypeId(other.getTypeId());
      }
      if (other.hasRead()) {
        setRead(other.getRead());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      if (!hasOp()) {
        
        return false;
      }
      if (!hasToken()) {
        
        return false;
      }
      if (!hasAppKey()) {
        
        return false;
      }
      if (!hasUserId()) {
        
        return false;
      }
      if (!hasTypeId()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.argo.qpush.protobuf.PBAPNSEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.argo.qpush.protobuf.PBAPNSEvent) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // required int32 op = 1;
    private int op_ ;
    /**
     * <code>required int32 op = 1;</code>
     */
    public boolean hasOp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 op = 1;</code>
     */
    public int getOp() {
      return op_;
    }
    /**
     * <code>required int32 op = 1;</code>
     */
    public Builder setOp(int value) {
      bitField0_ |= 0x00000001;
      op_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 op = 1;</code>
     */
    public Builder clearOp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      op_ = 0;
      onChanged();
      return this;
    }

    // required string token = 2;
    private java.lang.Object token_ = "";
    /**
     * <code>required string token = 2;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string token = 2;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string token = 2;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string token = 2;</code>
     */
    public Builder clearToken() {
      bitField0_ = (bitField0_ & ~0x00000002);
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>required string token = 2;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      token_ = value;
      onChanged();
      return this;
    }

    // required string appKey = 3;
    private java.lang.Object appKey_ = "";
    /**
     * <code>required string appKey = 3;</code>
     */
    public boolean hasAppKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string appKey = 3;</code>
     */
    public java.lang.String getAppKey() {
      java.lang.Object ref = appKey_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        appKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string appKey = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAppKeyBytes() {
      java.lang.Object ref = appKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string appKey = 3;</code>
     */
    public Builder setAppKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      appKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string appKey = 3;</code>
     */
    public Builder clearAppKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      appKey_ = getDefaultInstance().getAppKey();
      onChanged();
      return this;
    }
    /**
     * <code>required string appKey = 3;</code>
     */
    public Builder setAppKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      appKey_ = value;
      onChanged();
      return this;
    }

    // required string userId = 4;
    private java.lang.Object userId_ = "";
    /**
     * <code>required string userId = 4;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string userId = 4;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>required string userId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string userId = 4;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string userId = 4;</code>
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>required string userId = 4;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      userId_ = value;
      onChanged();
      return this;
    }

    // required int32 typeId = 5;
    private int typeId_ ;
    /**
     * <code>required int32 typeId = 5;</code>
     */
    public boolean hasTypeId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 typeId = 5;</code>
     */
    public int getTypeId() {
      return typeId_;
    }
    /**
     * <code>required int32 typeId = 5;</code>
     */
    public Builder setTypeId(int value) {
      bitField0_ |= 0x00000010;
      typeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 typeId = 5;</code>
     */
    public Builder clearTypeId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      typeId_ = 0;
      onChanged();
      return this;
    }

    // optional int32 read = 6;
    private int read_ ;
    /**
     * <code>optional int32 read = 6;</code>
     */
    public boolean hasRead() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 read = 6;</code>
     */
    public int getRead() {
      return read_;
    }
    /**
     * <code>optional int32 read = 6;</code>
     */
    public Builder setRead(int value) {
      bitField0_ |= 0x00000020;
      read_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 read = 6;</code>
     */
    public Builder clearRead() {
      bitField0_ = (bitField0_ & ~0x00000020);
      read_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:message.PBAPNSEvent)
  }

  static {
    defaultInstance = new PBAPNSEvent(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:message.PBAPNSEvent)
}

