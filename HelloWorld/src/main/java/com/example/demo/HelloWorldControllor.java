package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/hello-world") //setting an endpoint at this route
@RestController
public class HelloWorldControllor {

    //http request, Get, Post, Put, Patch, Delete;
    //format is request + Mapping like below. It is Getmapping;
    //server default at localhost:8080; by setting endpoint using @RequestMapping at line 8, we will get this response by reaching the preset endpoint only;
    @GetMapping
    public List<String> getHelloWorld() {
        return List.of("Hello", "World");
    }


}
