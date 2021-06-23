package com.mongo.demo_mongo.service;

import com.mongo.demo_mongo.dto.UserDto;
import com.mongo.demo_mongo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto createUser(UserDto userDto) {
        return userRepository.save(userDto);
    }

    public List<UserDto> getUsers() {
        return userRepository.findAll();
    }
}
