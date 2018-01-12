package com.xxx.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableDiscoveryClient
public class SpringBootApplication {

	public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
