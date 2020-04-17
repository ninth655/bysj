package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author yi
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public  String login(){
        return "login";
    }
    @ResponseBody
    @GetMapping("/hello/{id}")
    public User getName(@PathVariable long id){
        return userService.getName(id);
    }

}
