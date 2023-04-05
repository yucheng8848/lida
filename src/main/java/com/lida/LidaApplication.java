package com.lida;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@MapperScan("com.lida.mapper")
public class LidaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LidaApplication.class, args);
    }

}
