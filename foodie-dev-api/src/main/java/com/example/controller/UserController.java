package com.example.controller;

import com.example.pojo.Users;
import com.example.service.UsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
