package com.example.controller;

import com.example.pojo.Users;
import com.example.service.UsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

  @PutMapping("/update")
  public void update(@RequestBody Users users) {
    usersService.updateById(users);
  }

  @DeleteMapping("/delete")
  public void delete(@RequestBody String id) {
    usersService.removeById(id);
  }

}
