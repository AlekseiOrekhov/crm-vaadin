package com.example.crmvaadin.user.controller;

import org.atmosphere.config.service.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping("/getStatus")
    public boolean status() {
        return true;
    }
}
