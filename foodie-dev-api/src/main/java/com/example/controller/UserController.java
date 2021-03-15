package com.example.controller;

import com.example.utils.CookieUtils;
import com.example.utils.JsonUtils;
import com.example.vo.UserVO;
import com.example.pojo.Users;
import com.example.service.UsersService;
import com.example.utils.JSONResult;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired UsersService usersService;

  @GetMapping("/list")
  public List<Users> list(@RequestParam(name = "name", required = false) String name) {
    return usersService.list(name);
  }

  @GetMapping("/get")
  public Users get(@RequestParam("id") String id) {
    return usersService.getById(id);
  }

  @PostMapping("/register")
  public JSONResult add(
      @RequestBody UserVO userVO, HttpServletRequest request, HttpServletResponse response) {
    String username = userVO.getUsername();
    String password = userVO.getPassword();
    String confirmPwd = userVO.getConfirmPassword();

    // 0. 判断用户名和密码必须不为空
    if (StringUtils.isBlank(username)
        || StringUtils.isBlank(password)
        || StringUtils.isBlank(confirmPwd)) {
      return JSONResult.errorMsg("用户名或密码不能为空");
    }

    // 1. 查询用户名是否存在
    boolean isExist = usersService.usernameIsExist(username);
    if (isExist) {
      return JSONResult.errorMsg("用户名已经存在");
    }

    // 2. 密码长度不能少于6位
    if (password.length() < 6) {
      return JSONResult.errorMsg("密码长度不能少于6");
    }

    // 3. 判断两次密码是否一致
    if (!password.equals(confirmPwd)) {
      return JSONResult.errorMsg("两次密码输入不一致");
    }

    // 4. 实现注册
    Users users = usersService.saveUser(userVO);
    users = setNullProperty(users);

    CookieUtils.setCookie(request, response, "user", JsonUtils.objectToJson(users), true);
    return JSONResult.ok();
  }

  @PutMapping("/update")
  public void update(@RequestBody Users users) {
    usersService.updateById(users);
  }

  @DeleteMapping("/delete")
  public void delete(@RequestBody String id) {
    usersService.removeById(id);
  }

  private Users setNullProperty(Users userResult) {
    userResult.setPassword(null);
    userResult.setMobile(null);
    userResult.setEmail(null);
    userResult.setCreatedTime(null);
    userResult.setUpdatedTime(null);
    userResult.setBirthday(null);
    return userResult;
  }
}
