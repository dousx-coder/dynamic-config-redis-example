package io.github.dousxcoder.dcredisex;

import io.github.dousxcoder.dcredis.annotation.EnableDcredis;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Slf4j
@EnableDcredis(basePackages = {"io.github.dousxcoder.dcredisex"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
