package com.heshani.us.service.Impl;

import com.heshani.us.repository.UserRepository;
import com.heshani.us.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        if (!userRepository.existsByUsername(user.getUserName())) {
            throw new RuntimeException("User Not Found");
        }
        return userRepository.save(user);

    }
}
