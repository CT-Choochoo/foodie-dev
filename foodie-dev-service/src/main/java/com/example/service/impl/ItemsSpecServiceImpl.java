package com.example.service.impl;

import com.example.mapper.ItemsSpecMapper;
import com.example.pojo.ItemsSpec;
import com.example.service.ItemsSpecService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class ItemsSpecServiceImpl extends ServiceImpl<ItemsSpecMapper, ItemsSpec>
    implements ItemsSpecService {}
