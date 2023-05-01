package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach anotherCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.anotherCoach = anotherCoach;
        this.myCoach = coach;
    }

    @GetMapping("/daily-workout")
    public String getWorkout(){
        return this.myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String compareCoaches(){
        return "Compare beans: myCoach == anotherCoach " + (myCoach == anotherCoach);
    }
}
