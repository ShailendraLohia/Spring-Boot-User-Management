package com.springboot.example.controller;

import com.springboot.example.model.TripData;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserManagementController {

    @GetMapping("/user")
    public String validateApplication() {
        return "Application running successfully";
    }

    @PostMapping("/tripData")
    public String addUser(@RequestBody  TripData tripData) {

        return "Trip Booked";

    }
}
