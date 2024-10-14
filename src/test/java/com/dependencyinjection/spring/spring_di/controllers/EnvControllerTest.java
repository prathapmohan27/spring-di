package com.dependencyinjection.spring.spring_di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class EnvControllerTest {

    @Autowired
    EnvController envController;

    @Test
    void getEnv() {
        System.out.println(envController.getEnv());
    }
}