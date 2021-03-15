package com.example.controller;

import com.example.config.IMOOCJSONResult;
import com.example.service.UsersService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passport")
public class PassportController {
  @Autowired private UsersService usersService;

  @GetMapping("/usernameIsExist")
  public IMOOCJSONResult usernameIsExist(@RequestParam String username) {
    if (StringUtils.isEmpty(username)) {
      return IMOOCJSONResult.errorMsg("用户名不能为空！");
    }
    Boolean re = usersService.usernameIsExist(username);
    return re ? IMOOCJSONResult.ok() : IMOOCJSONResult.errorMsg("用户名已存在！");
  }
}
