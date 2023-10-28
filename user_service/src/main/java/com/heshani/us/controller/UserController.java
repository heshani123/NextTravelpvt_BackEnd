package com.heshani.us.controller;


import com.heshani.us.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    public
}
