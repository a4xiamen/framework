package com.xxx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用Eureka做服务发现。
 * @author eacdy
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableEurekaServer
public class SpringBootApplication {
  public static void main(String[] args) {
	  new SpringApplicationBuilder(SpringBootApplication.class).web(true).run(args);
  }
}