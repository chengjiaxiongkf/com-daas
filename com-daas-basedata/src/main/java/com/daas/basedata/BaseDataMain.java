package com.daas.basedata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author chengjiaxiong
 * @Date 2020/9/13 2:27
 */
@SpringBootApplication
@MapperScan("com.daas.basedata.mapper")
public class BaseDataMain {
    public static void main(String[] args) {
        new SpringApplication(BaseDataMain.class).run(args);
    }
}
