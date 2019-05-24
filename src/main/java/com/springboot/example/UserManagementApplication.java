package com.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
public class UserManagementApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserManagementApplication.class,args);
    }


}
