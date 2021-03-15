package com.example.vo;

import java.io.Serializable;
import java.util.StringJoiner;

public class UserVO  implements Serializable {


  private static final long serialVersionUID = 2016247254418250644L;

  /** 用户名 */
  private String username;

  /** 密码 */
  private String password;
  private String confirmPassword;



  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", UserVO.class.getSimpleName() + "[", "]")
        .add("username='" + username + "'")
        .add("password='" + password + "'")
        .add("confirmPassword='" + confirmPassword + "'")
        .toString();
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }
}
