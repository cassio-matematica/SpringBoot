package com.cassiodev.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}

}

@RestController
class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}