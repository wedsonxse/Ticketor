package com.org.ticketor.controller;

import com.org.ticketor.service.BandService;
import com.org.ticketor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/users")
@RestController
public class UserController {
    private final UserService service;
    @Autowired
    public UserController(UserService service){
        this.service = service;
    }
}
