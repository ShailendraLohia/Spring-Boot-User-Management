package com.springboot.example.service;

import com.springboot.example.model.UserInfo;

import java.util.Optional;

public interface UserManagement {

    public UserInfo addUser(UserInfo userInfo);
    public Optional<UserInfo> findUserInfo(String str);
}
