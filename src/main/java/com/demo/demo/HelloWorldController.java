package com.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
 
 @GetMapping("/")
    public String helloWorld(){
        return "Hellow World";
    }
    @GetMapping("/home")
    public String welcomeHome(){
        return "Welcome to Home page";
    }
    
}
