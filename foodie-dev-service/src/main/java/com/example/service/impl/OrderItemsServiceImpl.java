package com.example.service.impl;

import com.example.mapper.OrderItemsMapper;
import com.example.pojo.OrderItems;
import com.example.service.OrderItemsService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems>
    implements OrderItemsService {}
