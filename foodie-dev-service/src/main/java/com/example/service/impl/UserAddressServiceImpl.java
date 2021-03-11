package com.example.service.impl;

import com.example.mapper.UserAddressMapper;
import com.example.pojo.UserAddress;
import com.example.service.UserAddressService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress>
    implements UserAddressService {}
