package com.dependencyinjection.spring.spring_di.controllers;

import com.dependencyinjection.spring.spring_di.services.GreetingService;

public class propertyInjectController {

    GreetingService greetingService;

    String sayHello() {
        return greetingService.greet();
    }
}
