package com.springboot.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightConfirmationDetails {
    private String emailId;
    private JourneyInfo journeyInfo;
}
