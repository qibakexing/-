package com.qfedu.suning_e_commerce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.qfedu.suning_e_commerce.mapper")
public class SuningECommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuningECommerceApplication.class, args);
    }
}
