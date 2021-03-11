package com.example.service.impl;

import com.example.mapper.OrdersMapper;
import com.example.pojo.Orders;
import com.example.service.OrdersService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
