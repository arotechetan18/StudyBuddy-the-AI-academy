package com.studybuddy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student/profile")
    public String profile(){

        return "Welcome Student";

    }

}