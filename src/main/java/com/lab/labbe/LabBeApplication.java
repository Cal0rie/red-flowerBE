package com.lab.labbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class LabBeApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabBeApplication.class, args);
    }


}
