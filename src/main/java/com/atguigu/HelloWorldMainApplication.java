package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 *@SpringBootApplication标注，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring应用启动起来,传入的类必须是用@SpringBootApplication注解的
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
