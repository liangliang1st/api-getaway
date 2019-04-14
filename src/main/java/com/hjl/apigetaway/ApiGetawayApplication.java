package com.hjl.apigetaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiGetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGetawayApplication.class, args);
    }

}
