package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.ItemsImgMapper;
import com.example.pojo.ItemsImg;
import com.example.service.ItemsImgService;
import org.springframework.stereotype.Service;

@Service
public class ItemsImgServiceImpl extends ServiceImpl<ItemsImgMapper, ItemsImg>
    implements ItemsImgService {}
