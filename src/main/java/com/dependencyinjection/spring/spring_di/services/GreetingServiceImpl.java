package com.dependencyinjection.spring.spring_di.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return "hello form service";
    }
}
