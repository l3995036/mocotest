package com.yc.mocotest.mocotest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.yc.mocotest.mocotest.mapper")
@SpringBootApplication
public class MocotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MocotestApplication.class, args);
    }

}