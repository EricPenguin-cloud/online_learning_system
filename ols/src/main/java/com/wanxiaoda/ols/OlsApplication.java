package com.wanxiaoda.ols;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.wanxiaoda.ols.*")
@MapperScan({"com.wanxiaoda.ols.mapper"})
@SpringBootApplication
public class OlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OlsApplication.class, args);
    }

}
