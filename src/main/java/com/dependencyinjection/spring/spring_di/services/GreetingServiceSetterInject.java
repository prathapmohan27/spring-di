package com.dependencyinjection.spring.spring_di.services;


import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInject implements GreetingService {

    @Override
    public String greet() {
        return "hello from GreetingServiceSetterInject";
    }
}
