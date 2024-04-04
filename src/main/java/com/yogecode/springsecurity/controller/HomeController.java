package com.yogecode.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/welcome/{name}")
    public String sayWelcomeMessage(@PathVariable(name = "name") String name) {
        return "welcome "+name;
    }
}
