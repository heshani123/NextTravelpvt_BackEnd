package com.heshani.us.service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

   void deleteUser(Integer id);

    User updateUser(User user);


   List<User> fetchAllUsers();
}
