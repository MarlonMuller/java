package com.marlon.first_spring_app.controller;

import com.marlon.first_spring_app.domain.User;
import com.marlon.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.HelloWorld("Marlon");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World " + body.getName();
    }
}
