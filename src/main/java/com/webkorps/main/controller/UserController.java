package com.webkorps.main.controller;

import com.webkorps.main.entity.User;
import com.webkorps.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/")
    public User getUserById(@RequestParam int id) {
        return userService.getUserById(id);
    }

    @GetMapping(path = "/users")
    public List<User> getUserList() {
        return userService.getUser();
    }

    @PostMapping(path = "/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
