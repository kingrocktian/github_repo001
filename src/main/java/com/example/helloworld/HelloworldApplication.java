package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import java.lang.Thread;

@SpringBootApplication
public class HelloworldApplication {

    @RestController
    class HelloworldController {
         @GetMapping("/")
          String hello() {
             return "Hello, 灰度URL发布 --ROCK !";
          }
    }


	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
