package com.dependencyinjection.spring.spring_di.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return "hello form service";
    }
}
