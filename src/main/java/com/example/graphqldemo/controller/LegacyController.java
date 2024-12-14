package com.example.graphqldemo.controller;

import com.example.graphqldemo.model.User;
import com.example.graphqldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
public class LegacyController {
    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    private User getuser(@PathVariable int userId) throws Exception {
        User user = userService.get(userId);
        return user;
    }
}
