package com.mongo.demo_mongo.controller;

import com.mongo.demo_mongo.dto.UserDto;
import com.mongo.demo_mongo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto){
        return service.createUser(userDto);
    }

    @GetMapping
    public List<UserDto> getUsers(){
        return service.getUsers();
    }
}
