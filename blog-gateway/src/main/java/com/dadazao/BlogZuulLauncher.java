package com.dadazao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class BlogZuulLauncher {

    public static void main(String[] args) {
        SpringApplication.run(BlogZuulLauncher.class, args);
    }


}
