package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/** 用户表 */
@TableName(value = "users")
public class Users implements Serializable {
  /** 主键id 用户id */
  @TableId(value = "id", type = IdType.INPUT)
  private String id;

  /** 用户名 用户名 */
  @TableField(value = "username")
  private String username;

  /** 密码 密码 */
  @TableField(value = "password")
  private String password;

  /** 昵称 昵称 */
  @TableField(value = "nickname")
  private String nickname;

  /** 真实姓名 */
  @TableField(value = "realname")
  private String realname;

  /** 头像 */
  @TableField(value = "face")
  private String face;

  /** 手机号 手机号 */
  @TableField(value = "mobile")
  private String mobile;

  /** 邮箱地址 邮箱地址 */
  @TableField(value = "email")
  private String email;

  /** 性别 性别 1:男 0:女 2:保密 */
  @TableField(value = "sex")
  private Integer sex;

  /** 生日 生日 */
  @TableField(value = "birthday")
  private LocalDate birthday;

  /** 创建时间 创建时间 */
  @TableField(value = "created_time")
  private LocalDateTime createdTime;

  /** 更新时间 更新时间 */
  @TableField(value = "updated_time")
  private LocalDateTime updatedTime;

  private static final long serialVersionUID = 1L;

  public static final String COL_ID = "id";

  public static final String COL_USERNAME = "username";

  public static final String COL_PASSWORD = "password";

  public static final String COL_NICKNAME = "nickname";

  public static final String COL_REALNAME = "realname";

  public static final String COL_FACE = "face";

  public static final String COL_MOBILE = "mobile";

  public static final String COL_EMAIL = "email";

  public static final String COL_SEX = "sex";

  public static final String COL_BIRTHDAY = "birthday";

  public static final String COL_CREATED_TIME = "created_time";

  public static final String COL_UPDATED_TIME = "updated_time";

  /**
   * 获取主键id 用户id
   *
   * @return id - 主键id 用户id
   */
  public String getId() {
    return id;
  }

  /**
   * 设置主键id 用户id
   *
   * @param id 主键id 用户id
   */
  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  /**
   * 获取用户名 用户名
   *
   * @return username - 用户名 用户名
   */
  public String getUsername() {
    return username;
  }

  /**
   * 设置用户名 用户名
   *
   * @param username 用户名 用户名
   */
  public void setUsername(String username) {
    this.username = username == null ? null : username.trim();
  }

  /**
   * 获取密码 密码
   *
   * @return password - 密码 密码
   */
  public String getPassword() {
    return password;
  }

  /**
   * 设置密码 密码
   *
   * @param password 密码 密码
   */
  public void setPassword(String password) {
    this.password = password == null ? null : password.trim();
  }

  /**
   * 获取昵称 昵称
   *
   * @return nickname - 昵称 昵称
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * 设置昵称 昵称
   *
   * @param nickname 昵称 昵称
   */
  public void setNickname(String nickname) {
    this.nickname = nickname == null ? null : nickname.trim();
  }

  /**
   * 获取真实姓名
   *
   * @return realname - 真实姓名
   */
  public String getRealname() {
    return realname;
  }

  /**
   * 设置真实姓名
   *
   * @param realname 真实姓名
   */
  public void setRealname(String realname) {
    this.realname = realname == null ? null : realname.trim();
  }

  /**
   * 获取头像
   *
   * @return face - 头像
   */
  public String getFace() {
    return face;
  }

  /**
   * 设置头像
   *
   * @param face 头像
   */
  public void setFace(String face) {
    this.face = face == null ? null : face.trim();
  }

  /**
   * 获取手机号 手机号
   *
   * @return mobile - 手机号 手机号
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * 设置手机号 手机号
   *
   * @param mobile 手机号 手机号
   */
  public void setMobile(String mobile) {
    this.mobile = mobile == null ? null : mobile.trim();
  }

  /**
   * 获取邮箱地址 邮箱地址
   *
   * @return email - 邮箱地址 邮箱地址
   */
  public String getEmail() {
    return email;
  }

  /**
   * 设置邮箱地址 邮箱地址
   *
   * @param email 邮箱地址 邮箱地址
   */
  public void setEmail(String email) {
    this.email = email == null ? null : email.trim();
  }

  /**
   * 获取性别 性别 1:男 0:女 2:保密
   *
   * @return sex - 性别 性别 1:男 0:女 2:保密
   */
  public Integer getSex() {
    return sex;
  }

  /**
   * 设置性别 性别 1:男 0:女 2:保密
   *
   * @param sex 性别 性别 1:男 0:女 2:保密
   */
  public void setSex(Integer sex) {
    this.sex = sex;
  }

  /**
   * 获取生日 生日
   *
   * @return birthday - 生日 生日
   */
  public LocalDate getBirthday() {
    return birthday;
  }

  /**
   * 设置生日 生日
   *
   * @param birthday 生日 生日
   */
  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  /**
   * 获取创建时间 创建时间
   *
   * @return created_time - 创建时间 创建时间
   */
  public LocalDateTime getCreatedTime() {
    return createdTime;
  }

  /**
   * 设置创建时间 创建时间
   *
   * @param createdTime 创建时间 创建时间
   */
  public void setCreatedTime(LocalDateTime createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * 获取更新时间 更新时间
   *
   * @return updated_time - 更新时间 更新时间
   */
  public LocalDateTime getUpdatedTime() {
    return updatedTime;
  }

  /**
   * 设置更新时间 更新时间
   *
   * @param updatedTime 更新时间 更新时间
   */
  public void setUpdatedTime(LocalDateTime updatedTime) {
    this.updatedTime = updatedTime;
  }
}
