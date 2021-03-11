package com.example.service.impl;

import com.example.mapper.OrderStatusMapper;
import com.example.pojo.OrderStatus;
import com.example.service.OrderStatusService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class OrderStatusServiceImpl extends ServiceImpl<OrderStatusMapper, OrderStatus>
    implements OrderStatusService {}
