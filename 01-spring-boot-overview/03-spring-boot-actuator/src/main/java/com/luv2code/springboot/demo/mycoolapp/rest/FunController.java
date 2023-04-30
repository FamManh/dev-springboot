package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
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
}
