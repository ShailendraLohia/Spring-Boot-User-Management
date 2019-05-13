package com.springboot.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JourneyInfo {
    private Date startDateOfTravel;
    private Date returnDateOfTravel;
    private int numberOfPassenger;
    private String cityToTravel;
}
