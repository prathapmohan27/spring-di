package com.dependencyinjection.spring.spring_di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service()
public class EnvServiceUat implements EnvService {

    @Override
    public String getEnvironment() {
        return "Uat environment";
    }
}
