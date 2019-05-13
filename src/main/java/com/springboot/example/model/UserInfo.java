package com.springboot.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String emailId;
    private String phoneNumber;
    private String city;
    private String state;
    private String name;
    private int age;
}
