package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis plus 配置
 *
 * @author jiangyong
 */
@Configuration
@MapperScan("com.example.mapper*")
public class MybatisPlusConfig {

  /**
   * * plus 的性能优化,日志打印,开发环境使用
   *
   * @return
   */

  /**
   * mybatis-plus分页插件<br>
   * 文档：http://mp.baomidou.com<br>
   */
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
    paginationInterceptor.setDialectType("mysql");
    return paginationInterceptor;
  }
}
