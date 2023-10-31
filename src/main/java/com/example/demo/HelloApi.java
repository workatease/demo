package com.example.demo;


import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class HelloApi {

    @GetMapping("/hello")
    public String hello() {

        log.info("Hello from Spring Boot");
        return "Hello from Spring Boot";
    }
}