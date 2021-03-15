package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Users;
import java.util.List;

public interface UsersService extends IService<Users>{

  /**
   * 获取用户列表
   * @param name
   * @return
   */
  List<Users> list(String name);

  /**
   * 查询用户名是否存在
   *
   * @param username
   * @return
   */
  Boolean usernameIsExist(String username);
}
