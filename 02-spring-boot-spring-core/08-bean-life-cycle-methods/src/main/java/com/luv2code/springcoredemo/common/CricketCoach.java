package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    //  define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In my startup stuff: " + getClass().getSimpleName());
    }

    // define our cleanup method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In my cleanup stuff: " + getClass().getSimpleName());
    }

    @Autowired
    public void CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :-)";
    }
}
