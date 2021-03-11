package com.example.service.impl;

import com.example.mapper.StuMapper;
import com.example.pojo.Stu;
import com.example.service.StuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements StuService {

}
