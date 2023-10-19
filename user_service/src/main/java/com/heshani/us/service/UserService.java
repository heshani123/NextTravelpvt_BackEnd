package com.heshani.us.service;

import org.apache.catalina.User;

public interface UserService {
    Object addUser(User user);

    void deleteUser(Integer id);
}
