package com.springboot.example.service;

import com.springboot.example.model.JourneyDetails;
import com.springboot.example.model.UserInfo;
import com.springboot.example.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserManagementServiceImpl implements UserManagement {

    @Autowired
    private UserDataRepository userDataRepository;

    public UserInfo addUser(UserInfo userInfo) {
        return userDataRepository.save(userInfo);

    }

    public Optional<UserInfo> findUserInfo(String emailId) {
        return userDataRepository.findById(emailId);
    }
}
