package com.example.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.StringJoiner;
@ApiModel
public class UserVO  implements Serializable {


  private static final long serialVersionUID = 2016247254418250644L;

  /** 用户名 */
  @ApiModelProperty(value = "用户名" ,name = "username",example = "xiIj")
  private String username;

  /** 密码 */
  @ApiModelProperty(value = "密码" ,name = "password",example = "123456")
  private String password;
  @ApiModelProperty(value = "确认密码" ,name = "confirmPassword",example = "123456")
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
