package com.harpreet.didemo.controllers;

import com.harpreet.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }
}
