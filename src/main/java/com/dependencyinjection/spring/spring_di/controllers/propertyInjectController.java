package com.dependencyinjection.spring.spring_di.controllers;

import com.dependencyinjection.spring.spring_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class propertyInjectController {

    @Autowired
    GreetingService greetingService;

    String sayHello() {
        return greetingService.greet();
    }
}
