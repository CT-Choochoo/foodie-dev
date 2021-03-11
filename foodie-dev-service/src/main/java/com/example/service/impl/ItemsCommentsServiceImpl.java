package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.ItemsCommentsMapper;
import com.example.pojo.ItemsComments;
import com.example.service.ItemsCommentsService;
import org.springframework.stereotype.Service;

@Service
public class ItemsCommentsServiceImpl extends
    ServiceImpl<ItemsCommentsMapper, ItemsComments> implements ItemsCommentsService {

}
