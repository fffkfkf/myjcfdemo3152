package com.sitech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientserviceApplication {
 public static void main(String[] args) {
  SpringApplication.run(ClientserviceApplication.class, args);
 }


}
