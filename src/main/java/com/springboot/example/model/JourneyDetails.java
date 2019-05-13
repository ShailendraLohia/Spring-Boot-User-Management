package com.springboot.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JourneyDetails {
    private UserInfo userData;
    private JourneyInfo journeyData;
}
