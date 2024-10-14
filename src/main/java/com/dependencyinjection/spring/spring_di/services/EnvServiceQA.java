package com.dependencyinjection.spring.spring_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service()
public class EnvServiceQA implements EnvService {
    @Override
    public String getEnvironment() {
        return "QA Environment";
    }
}
