package com.example.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;

public class FastJsonHttpMessageConverterConfig extends FastJsonHttpMessageConverter {
  public static FastJsonHttpMessageConverterConfig instance = new FastJsonHttpMessageConverterConfig();

  public FastJsonHttpMessageConverterConfig() {
    this.initConfig();
  }

  private void initConfig() {
    this.setFastJsonConfig(FastJsonConfigInstance.instance);
    List<MediaType> fastMediaTypes = new ArrayList();
    fastMediaTypes.add(MediaType.APPLICATION_JSON);
    this.setSupportedMediaTypes(fastMediaTypes);
  }
}
