package com.example.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试事务
 */
public interface TestTransService {

    /**
     * 测试事务传播
     */
    void testPropagationTrans();

}
