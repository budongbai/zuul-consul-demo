package com.lljtest.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceaApplication.class, args);
    }

}
