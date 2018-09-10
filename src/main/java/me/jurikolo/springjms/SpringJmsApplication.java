package me.jurikolo.springjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class SpringJmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJmsApplication.class, args);
    }
}
