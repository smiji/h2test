package com.home.h2test.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@Slf4j
public class H2TestStarter implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(H2TestStarter.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Started the application..");
    }
}
