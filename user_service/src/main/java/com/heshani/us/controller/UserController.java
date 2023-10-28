package com.heshani.us.controller;


import com.heshani.us.service.UserService;
import com.heshani.us.utill.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/add_user")
    public ResponceUtill addUser (@RequestBody User user){
        return new ResponseUtill("OK", "Added", userService.addUser(user));
    }
}
