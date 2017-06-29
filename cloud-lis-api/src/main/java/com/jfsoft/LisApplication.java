package com.jfsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by web on 2017/6/28.
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.jfsoft.*.mapper")
public class LisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LisApplication.class, args);
    }

}