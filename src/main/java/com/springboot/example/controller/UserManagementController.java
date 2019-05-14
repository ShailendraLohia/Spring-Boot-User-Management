package com.springboot.example.controller;

import com.netflix.discovery.converters.Auto;
import com.springboot.example.model.FlightConfirmationDetails;
import com.springboot.example.model.TripData;
import com.springboot.example.model.UserInfo;
import com.springboot.example.service.UserManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserManagementController {

    @Autowired
    private UserManagementServiceImpl userManagementService;

    @GetMapping("/user")
    public String validateApplication() {

        return "Application running successfully";
    }

    @PostMapping("/tripData")
    public FlightConfirmationDetails addUser(@RequestBody  TripData tripData) {
        UserInfo userInfo= userManagementService.addUser(tripData.getTripData().getUserData());
        FlightConfirmationDetails flightConfirmationDetails=new FlightConfirmationDetails();

        flightConfirmationDetails.setEmailId(userInfo.getEmailId());
        flightConfirmationDetails.setJourneyInfo(tripData.getTripData().getJourneyData());


        return flightConfirmationDetails;

    }
    @GetMapping("/trips/{emailId}")

    public Optional<UserInfo> getUserDetails(@PathVariable String emailId) {
        return userManagementService.findUserInfo(emailId);
    }
}
