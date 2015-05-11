// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yingshibao.proto

package com.yingshibao.app.idl;

public interface UserInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:yingshibao.UserInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string nickName = 1;</code>
   *
   * <pre>
   * 昵称
   * </pre>
   */
  boolean hasNickName();
  /**
   * <code>required string nickName = 1;</code>
   *
   * <pre>
   * 昵称
   * </pre>
   */
  java.lang.String getNickName();
  /**
   * <code>required string nickName = 1;</code>
   *
   * <pre>
   * 昵称
   * </pre>
   */
  com.google.protobuf.ByteString
      getNickNameBytes();

  /**
   * <code>optional string schoolName = 2;</code>
   *
   * <pre>
   * 学校名称
   * </pre>
   */
  boolean hasSchoolName();
  /**
   * <code>optional string schoolName = 2;</code>
   *
   * <pre>
   * 学校名称
   * </pre>
   */
  java.lang.String getSchoolName();
  /**
   * <code>optional string schoolName = 2;</code>
   *
   * <pre>
   * 学校名称
   * </pre>
   */
  com.google.protobuf.ByteString
      getSchoolNameBytes();

  /**
   * <code>required string phone = 3;</code>
   *
   * <pre>
   * 手机号码
   * </pre>
   */
  boolean hasPhone();
  /**
   * <code>required string phone = 3;</code>
   *
   * <pre>
   * 手机号码
   * </pre>
   */
  java.lang.String getPhone();
  /**
   * <code>required string phone = 3;</code>
   *
   * <pre>
   * 手机号码
   * </pre>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>required uint32 examType = 4;</code>
   *
   * <pre>
   * 考试类型 1:四级英语 2:六级英语 3:考研英语 4:考研政治 5:考研数学 6:高考
   * </pre>
   */
  boolean hasExamType();
  /**
   * <code>required uint32 examType = 4;</code>
   *
   * <pre>
   * 考试类型 1:四级英语 2:六级英语 3:考研英语 4:考研政治 5:考研数学 6:高考
   * </pre>
   */
  int getExamType();

  /**
   * <code>required string channelName = 5;</code>
   *
   * <pre>
   * 用户来源渠道
   * </pre>
   */
  boolean hasChannelName();
  /**
   * <code>required string channelName = 5;</code>
   *
   * <pre>
   * 用户来源渠道
   * </pre>
   */
  java.lang.String getChannelName();
  /**
   * <code>required string channelName = 5;</code>
   *
   * <pre>
   * 用户来源渠道
   * </pre>
   */
  com.google.protobuf.ByteString
      getChannelNameBytes();
}