package com.studybuddy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studybuddy.Entities.User;
import com.studybuddy.Services.UserService;
import com.studybuddy.repository.Userrepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

   @PostMapping("/register")
public String register(@RequestBody User user) {
    userService.registerUser(user);
    return "User registered successfully";
}
}