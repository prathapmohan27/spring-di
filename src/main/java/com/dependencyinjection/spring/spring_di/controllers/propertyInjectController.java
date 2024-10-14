package com.dependencyinjection.spring.spring_di.controllers;

import com.dependencyinjection.spring.spring_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class propertyInjectController {

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    String sayHello() {
        return greetingService.greet();
    }
}
