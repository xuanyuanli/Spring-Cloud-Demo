package com.dadazao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerLauncher.class, args);
    }
}
