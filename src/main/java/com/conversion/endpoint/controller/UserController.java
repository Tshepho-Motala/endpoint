package com.conversion.endpoint.controller;

import com.conversion.endpoint.model.UserRepository;
import com.conversion.endpoint.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}