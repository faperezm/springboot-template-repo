package com.home.test.mstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsTestApplication.class, args);
    }

}

@RestController
class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
     @RequestMapping("/bye")
    public String bye() {
        return "Bye, Bye!!!!";
    }
}