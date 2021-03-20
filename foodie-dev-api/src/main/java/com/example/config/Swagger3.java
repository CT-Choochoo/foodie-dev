package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class Swagger3 {

  //    http://localhost:8088/swagger-ui.html     原路径
  //    http://localhost:8088/doc.html     原路径

  /**
   * 配置swagger2核心配置 docket
   */
  @Bean
  public Docket createRestApi() {
    // 指定api类型为swagger3
    return new Docket(DocumentationType.OAS_30)
        // 用于定义api文档汇总信息
        .apiInfo(apiInfo())
        .enable(true)
        .select()
        // 指定controller包
        .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
        // 所有controller
        .paths(PathSelectors.any())
        .build();
  }


  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        // 文档页标题
        .title("foodie接口api")
        // 联系人信息
        .contact(new Contact("高建国", "https://www.baidu.com", "304590126@qq.com"))
        // 详细信息
        .description("接口文档说明信息")
        // 文档版本号
        .version("1.0.1")
        // 网站地址
        .termsOfServiceUrl("https://www.xxxxx.com")
        .build();
  }
}
