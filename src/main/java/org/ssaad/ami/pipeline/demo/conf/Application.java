package org.ssaad.ami.pipeline.demo.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.ssaad.ami")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
