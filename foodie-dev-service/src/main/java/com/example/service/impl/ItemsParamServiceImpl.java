package com.example.service.impl;

import com.example.mapper.ItemsParamMapper;
import com.example.pojo.ItemsParam;
import com.example.service.ItemsParamService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class ItemsParamServiceImpl extends ServiceImpl<ItemsParamMapper, ItemsParam>
    implements ItemsParamService {}
