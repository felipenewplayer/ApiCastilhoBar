package com.example.felipe.burguerApi.controller;

import com.example.felipe.burguerApi.model.User;
import com.example.felipe.burguerApi.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signUp")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> signUp(@RequestBody User user){
        User newUSer = service.createUser(user);
        return ResponseEntity.ok(newUSer);
    }
}
