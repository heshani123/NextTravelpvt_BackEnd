package com.heshani.us.controller;

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
        userService.addUser(user);

        return  new ResponseUtil("Okay","Added",null);
    }
    @PutMapping(value = "update_user")
    public ResponseUtil updateUser(@RequestBody User user){
        userService.updateUser(user);
        return new ResponseUtil("Okay","Updated",null);
    }
    @DeleteMapping(value = "/delete_user")
    public ResponseUtill deleteUser(@RequestParam Integer id){

        userService.deleteUser(id);
        return new ResponseUtil ("Okay","Deleted",null);
    }

    @GetMapping(value = "/fetch_users")
    public ResponseUtil fetchAllUsers() {
        return new ResponseUtill("Okay","Done",userService.fetchAllUsers());
    }

    @GetMapping(value = "/check")
    public ResponseUtil checkLogin(@RequestBody loginDto loginDto) {
        userService.checkLogin(loginDto.getUserName(),loginDto.getPassword());
        return new ResponseUtil("Okay","Food have",null);


    }

}
