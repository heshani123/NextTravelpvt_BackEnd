package com.heshani.us.controller;

import com.heshani.us.service.UserService;
import org.apache.catalina.User;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/add_user")
    public ResponseUtil addUser(@RequestBody User user ){

        return new ResponseUtil("OK", "Added", userService.addUser(user));
    }
    @PutMapping(value = "update_user")
    public ResponseUtil updateUser(@RequestBody User user){
        return new ResponseUtil("Okay","Updated",userService.updateUser(user));
    }
    @DeleteMapping(value = "/delete_user")
    public ResponseUtil deleteUser(@RequestParam Integer id){

        userService.deleteUser(id);
        return new ResponseUtil("Ok","User Deleted",null);
    }

    @GetMapping(value = "/fetch_users")
    public ResponseUtil fetchAllUsers() {
        return new ResponseUtil ("Okay","",userService.fetchAllUsers());
    }

    @GetMapping(value = "/check")
    public ResponseUtil checkLogin(@RequestBody LoginDto loginDto) {
        return new ResponseUtil ("OK", "Access Granted", userService.checkLogin(loginDto.getuserName()
                , loginDto.getP
                assword()));
    }

    }


