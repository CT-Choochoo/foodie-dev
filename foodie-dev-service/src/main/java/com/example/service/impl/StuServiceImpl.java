package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.StuMapper;
import com.example.pojo.Stu;
import com.example.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements StuService {

  @Autowired
  private StuMapper stuMapper;

  @Transactional(propagation = Propagation.REQUIRED)
  @Override
  public void saveChildren() {
    saveChild1();
    int a = 1 / 0;
    saveChild2();
  }

  public void saveChild1() {
    Stu stu1 = new Stu();
    stu1.setName("child-1");
    stu1.setAge(11);
    stuMapper.insert(stu1);
  }

  public void saveChild2() {
    Stu stu2 = new Stu();
    stu2.setName("child-2");
    stu2.setAge(22);
    stuMapper.insert(stu2);
  }
}
