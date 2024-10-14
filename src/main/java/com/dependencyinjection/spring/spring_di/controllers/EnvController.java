package com.dependencyinjection.spring.spring_di.controllers;

import com.dependencyinjection.spring.spring_di.services.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvController {
    private final EnvService envService;

    public EnvController(EnvService envService) {
        this.envService = envService;
    }

    public String getEnv() {
        return envService.getEnvironment();
    }
}
