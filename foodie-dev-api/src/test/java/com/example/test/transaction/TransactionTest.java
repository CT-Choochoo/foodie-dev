package com.example.test.transaction;

import com.example.service.StuService;
import com.example.service.TestTransService;
import com.example.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 事务测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionTest {

  @Autowired
  StuService stuService;
  @Autowired
  TestTransService testTransService;

  @Test
  public void TransactionTest1(){
    testTransService.testPropagationTrans();
//    testTransService.saveChildren();
  }

}
