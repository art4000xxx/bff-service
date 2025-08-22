package com.example.bffservice.controller;

import com.example.bffservice.model.UserProfile;
import com.example.bffservice.service.BffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/site-bff")
public class BffController {
    @Autowired
    private BffService bffService;

    @GetMapping("/user/{userId}")
    public UserProfile getUserProfile(@PathVariable Long userId) {
        UserProfile profile = new UserProfile();
        profile.setUser(bffService.getUser(userId));
        profile.setOrders(bffService.getOrders(userId));
        return profile;
    }
}