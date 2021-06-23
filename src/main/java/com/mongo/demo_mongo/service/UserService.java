package com.mongo.demo_mongo.service;

import com.mongo.demo_mongo.dto.UserDto;
import com.mongo.demo_mongo.repository.AddressesRepository;
import com.mongo.demo_mongo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final AddressesRepository addressesRepository;

    public UserService(UserRepository userRepository, AddressesRepository addressesRepository) {
        this.userRepository = userRepository;
        this.addressesRepository = addressesRepository;
    }

    public UserDto createUser(UserDto userDto) {
        addressesRepository.saveAll(userDto.getAddresses());
        return userRepository.save(userDto);
    }

    public List<UserDto> getUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(String id) {
        UserDto userDto = getUserById(id);
        userRepository.delete(userDto);
    }

    public UserDto getUserById(String id) {
       return userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User dont find"));
    }
}
