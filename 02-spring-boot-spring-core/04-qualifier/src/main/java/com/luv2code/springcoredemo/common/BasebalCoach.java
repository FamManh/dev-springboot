package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasebalCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes for batching practice!";
    }
}
