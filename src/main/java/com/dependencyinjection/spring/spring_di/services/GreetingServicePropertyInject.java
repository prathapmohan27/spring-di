package com.dependencyinjection.spring.spring_di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInject implements GreetingService {

    @Override
    public String greet() {
        return "hello from GreetingServicePropertyInject";
    }
}
