package com.example.felipe.burguerApi.service;

import com.example.felipe.burguerApi.model.User;
import com.example.felipe.burguerApi.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public User createUser(User user){
        return repository.save(user);
    }
}
