package com.example.service.impl;

import com.example.mapper.ItemsMapper;
import com.example.pojo.Items;
import com.example.service.ItemsService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items> implements ItemsService {

}
