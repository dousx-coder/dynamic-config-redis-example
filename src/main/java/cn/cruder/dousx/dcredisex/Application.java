package cn.cruder.dousx.dcredisex;

import cn.cruder.dousx.dcredis.annotation.EnableDcredis;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Slf4j
@EnableDcredis(basePackages = {"cn.cruder", "cn.cruder.dousx.dcredisex"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
