package com.example.config;

import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * AdminServlet配置类
 *
 * <p>AdminConfig
 *
 * <p>useDefaultFilters：指示是否自动检测类的注释
 */
@Configuration
@EnableWebMvc
public class WebServletConfig implements WebMvcConfigurer {


  @Override
  public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    /** 把fastjson放第一位，优先解析 application/json,不支持的，留给spring 默认的HttpMessageConverter */
    converters.add(0, FastJsonHttpMessageConverterConfig.instance);
  }

}
