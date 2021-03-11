package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mapper.UsersMapper;
import com.example.pojo.Users;
import com.example.service.UsersService;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

  @Override
  public List<Users> list(String name) {
    return this.list(
        new LambdaQueryWrapper<Users>().like(Objects.nonNull(name), Users::getNickname, name));
  }
}
