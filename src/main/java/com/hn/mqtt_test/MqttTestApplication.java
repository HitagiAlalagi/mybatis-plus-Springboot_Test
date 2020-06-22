package com.hn.mqtt_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hn.mqtt_test.mapper")
@SpringBootApplication
public class MqttTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqttTestApplication.class, args);
    }

}
