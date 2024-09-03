package com.swiftbizcentral.spring_boot_cicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/welcome")
    public String getMessage() {
        return "Hello Swift Biz Central.";
    }

    @RequestMapping("/users")
    public String getUsers() {
        return "Users Meng Spring Boot";
    }
}
