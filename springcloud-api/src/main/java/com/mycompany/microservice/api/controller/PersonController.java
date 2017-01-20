package com.mycompany.microservice.api.controller;

import com.mycompany.microservice.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tao on 17/1/19.
 */
@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/hello")
    public  String hello(){
        userService.hello();
        return "Hello";
    }
}
