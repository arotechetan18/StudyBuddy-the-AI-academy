package com.studubuddy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //fro testing only
    @GetMapping("/test")
    public String test() {
        return "Backend is running successfully add";
    }
}