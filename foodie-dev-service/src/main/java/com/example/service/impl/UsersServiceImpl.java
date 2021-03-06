package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.enums.Sex;
import com.example.exception.BusinessException;
import com.example.mapper.UsersMapper;
import com.example.pojo.Users;
import com.example.service.UsersService;
import com.example.utils.JSONResult;
import com.example.utils.MD5Utils;
import com.example.vo.UserVO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.time.DateUtils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

  @Autowired UsersMapper usersMapper;
  @Autowired Sid sid;

  @Override
  public List<Users> list(String name) {
    return this.list(
        new LambdaQueryWrapper<Users>().like(Objects.nonNull(name), Users::getNickname, name));
  }

  /**
   * 查询用户名是否存在
   *
   * @param username
   * @return
   */
  @Override
  public Boolean usernameIsExist(String username) {
    Integer integer =
        usersMapper.selectCount(new LambdaQueryWrapper<Users>().eq(Users::getUsername, username));
    return !integer.equals(0);
  }

  private static final String FACE_IMG_URL = "http://11sd5.com/sf/svcxcv";
  /**
   * 保存用户
   *
   * @param userVO
   * @return
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public Users saveUser(UserVO userVO) throws Exception {
    // 1. 查询用户名是否存在
    boolean isExist = this.usernameIsExist(userVO.getUsername());
    if (isExist) {
      throw new BusinessException("查询用户已存在！");
    }
    Users user = new Users();
    user.setId(sid.nextShort());
    user.setUsername(userVO.getUsername());
    user.setPassword(MD5Utils.getMD5Str(userVO.getPassword()));
    user.setNickname(userVO.getUsername());
    user.setFace(FACE_IMG_URL);
    user.setSex(Sex.secret.type);
    user.setBirthday(LocalDate.now());
    user.setUpdatedTime(LocalDateTime.now());
    user.setCreatedTime(LocalDateTime.now());
    usersMapper.insert(user);
    return user;
  }

  /**
   * 验证登录
   * @param username 用户名
   * @param md5Str
   * @return
   */
  @Override
  public Users queryUserForLogin(String username, String md5Str) {
    return usersMapper.selectOne(
        new LambdaQueryWrapper<Users>().eq(Users::getUsername, username)
            .eq(Users::getPassword, md5Str));
  }
}
