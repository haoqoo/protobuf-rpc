// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.yingshibao.app.idl;

@SuppressWarnings("hiding")
public final class UserInfo extends
    com.google.protobuf.nano.MessageNano {

  private static volatile UserInfo[] _emptyArray;
  public static UserInfo[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new UserInfo[0];
        }
      }
    }
    return _emptyArray;
  }

  // required string nickName = 1;
  public java.lang.String nickName;

  // optional string schoolName = 2;
  public java.lang.String schoolName;

  // required string phone = 3;
  public java.lang.String phone;

  // required uint32 examType = 4;
  public int examType;

  // required string channelName = 5;
  public java.lang.String channelName;

  public UserInfo() {
    clear();
  }

  public UserInfo clear() {
    nickName = "";
    schoolName = "";
    phone = "";
    examType = 0;
    channelName = "";
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    output.writeString(1, this.nickName);
    if (!this.schoolName.equals("")) {
      output.writeString(2, this.schoolName);
    }
    output.writeString(3, this.phone);
    output.writeUInt32(4, this.examType);
    output.writeString(5, this.channelName);
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeStringSize(1, this.nickName);
    if (!this.schoolName.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(2, this.schoolName);
    }
    size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeStringSize(3, this.phone);
    size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeUInt32Size(4, this.examType);
    size += com.google.protobuf.nano.CodedOutputByteBufferNano
        .computeStringSize(5, this.channelName);
    return size;
  }

  @Override
  public UserInfo mergeFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return this;
        default: {
          if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
            return this;
          }
          break;
        }
        case 10: {
          this.nickName = input.readString();
          break;
        }
        case 18: {
          this.schoolName = input.readString();
          break;
        }
        case 26: {
          this.phone = input.readString();
          break;
        }
        case 32: {
          this.examType = input.readUInt32();
          break;
        }
        case 42: {
          this.channelName = input.readString();
          break;
        }
      }
    }
  }

  public static UserInfo parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new UserInfo(), data);
  }

  public static UserInfo parseFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new UserInfo().mergeFrom(input);
  }
}
