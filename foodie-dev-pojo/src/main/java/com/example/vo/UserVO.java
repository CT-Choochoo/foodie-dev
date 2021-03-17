package com.example.vo;
import com.example.validation.RegisterGroup;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.StringJoiner;

@ApiModel
public class UserVO implements Serializable {


  private static final long serialVersionUID = 2016247254418250644L;

  /**
   * 用户名
   */
  @ApiModelProperty(value = "用户名", name = "username", example = "xiIj")
  @NotBlank(message = "用户名不能为空!",groups = {RegisterGroup.class})
  private String username;

  /**
   * 密码
   */
  @ApiModelProperty(value = "密码", name = "password", example = "123456")
  @Size (min=6,message = "密码长度不能少于6位！")
  @NotBlank(message = "密码不能为空!",groups = {RegisterGroup.class})
  private String password;
  @ApiModelProperty(value = "确认密码", name = "confirmPassword", example = "123456")
  @NotBlank(message = "请确认密码!",groups = {RegisterGroup.class})
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
