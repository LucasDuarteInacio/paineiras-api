package com.gas.painerasapi.controller;

import com.gas.painerasapi.entity.User;
import com.gas.painerasapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAllUsers();
    }

    @PostMapping
    public User newUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
