package com.example.helloSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping()
    public String hello(){

        return "Hello, How are you?";
    }

    @GetMapping(path = "/hello/{name}")
    public String hello(@PathVariable String name){

        return "Hello, "+name+" How are you?";
    }

}
