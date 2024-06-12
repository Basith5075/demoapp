package com.example.helloSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping(path = "/greet")
    public String greet(@RequestParam("name") String name) {
        return "Hello " + name + "!" +" \n How are you ??";
    }
    @GetMapping(path = "/greeting")
    public String greetings() {
        return "Hello \n How are you ??";
    }
}
