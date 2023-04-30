package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    // inject properties for: coach.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.team}")
    private String coachTeam;

    @GetMapping("/")
    String helloWorld(){
        return "Hello world";
    }

    @GetMapping("/workout")
    String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    //    expose a new endpoint for fotune
    @GetMapping("/fortune")
    String getDailyFortune(){
        return "Today is your lucky day!";
    }

    // expose a new endpoint for teaminfo
    @GetMapping("/team-info")
    String getTeamInfo(){
        return "Coach: " + this.coachName + ". Team: " + this.coachTeam;
    }
}
