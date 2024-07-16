package com.nemos.AASS.AASS.controller;

import com.nemos.AASS.AASS.model.User;
import com.nemos.AASS.AASS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping("register")
    public User register(@RequestBody User user){
        return service.saveUser(user);
    }
}
