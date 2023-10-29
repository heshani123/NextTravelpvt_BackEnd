package com.heshani.ds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin
@RestController("*")
@RequestMapping(value = "/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

}
