package com.atguigu.gulimall.ssoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@SpringBootApplication
public class GulimallTestSsoClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallTestSsoClientApplication.class, args);
    }

}
