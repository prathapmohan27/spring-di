package com.dependencyinjection.spring.spring_di.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String greet() {
        return "Hello from Primary Service";
    }
}
