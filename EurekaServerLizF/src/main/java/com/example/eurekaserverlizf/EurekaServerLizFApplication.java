package com.example.eurekaserverlizf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerLizFApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerLizFApplication.class, args);
    }

}
