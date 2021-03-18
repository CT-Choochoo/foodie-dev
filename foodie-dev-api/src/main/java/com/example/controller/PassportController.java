package com.example.controller;

import com.example.pojo.Users;
import com.example.service.UsersService;
import com.example.utils.CookieUtils;
import com.example.utils.JSONResult;
import com.example.utils.JsonUtils;
import com.example.utils.MD5Utils;
import com.example.validation.RegisterGroup;
import com.example.vo.UserVO;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passport")
@Validated
public class PassportController {

  @Autowired
  private UsersService usersService;

  @GetMapping("/usernameIsExist")
  @ApiOperation(value = "用户是否存在", notes = "用户是否存在", httpMethod = "GET")
  public JSONResult usernameIsExist(@RequestParam String username) {
    if (StringUtils.isEmpty(username)) {
      return JSONResult.errorMsg("用户名不能为空！");
    }
    Boolean re = usersService.usernameIsExist(username);
    return re ? JSONResult.errorMsg("用户名已存在！") : JSONResult.ok();
  }

  @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
  @PostMapping("/login")
  public JSONResult login(
      @RequestBody UserVO userVO, HttpServletRequest request, HttpServletResponse response)
      throws Exception {

    String username = userVO.getUsername();
    String password = userVO.getPassword();

    // 0. 判断用户名和密码必须不为空
    if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
      return JSONResult.errorMsg("用户名或密码不能为空");
    }

    // 1. 实现登录
    Users userResult = usersService.queryUserForLogin(username, MD5Utils.getMD5Str(password));

    if (userResult == null) {
      return JSONResult.errorMsg("用户名或密码不正确");
    }

    setNullProperty(userResult);

    CookieUtils.setCookie(request, response, "user", JsonUtils.objectToJson(userResult), true);

    // TODO 生成用户token，存入redis会话
    // TODO 同步购物车数据

    return JSONResult.ok(userResult);
  }

  private void setNullProperty(Users userResult) {
    userResult.setPassword(null);
    userResult.setMobile(null);
    userResult.setEmail(null);
    userResult.setCreatedTime(null);
    userResult.setUpdatedTime(null);
    userResult.setBirthday(null);
  }

  @ApiOperation(value = "注册用户", notes = "用户注册", httpMethod = "POST")
  @PostMapping("/register")
  public JSONResult add(
      @RequestBody @Validated(RegisterGroup.class) UserVO userVO, HttpServletRequest request,
      HttpServletResponse response)
      throws Exception {
    String password = userVO.getPassword();
    String confirmPwd = userVO.getConfirmPassword();
    if (!password.equals(confirmPwd)) {
      return JSONResult.errorMsg("两次密码输入不一致");
    }
    Users users = usersService.saveUser(userVO);
    setNullProperty(users);
    CookieUtils.setCookie(request, response, "user", JsonUtils.objectToJson(users), true);
    return JSONResult.ok();
  }
  @ApiOperation(value = "用户退出登录", notes = "用户退出登录", httpMethod = "POST")
  @PostMapping("/logout")
  public JSONResult logout(@RequestParam String userId,
      HttpServletRequest request,
      HttpServletResponse response) {

    // 清除用户的相关信息的cookie
    CookieUtils.deleteCookie(request, response, "user");

    // TODO 用户退出登录，需要清空购物车
    // TODO 分布式会话中需要清除用户数据

    return JSONResult.ok();
  }

}
