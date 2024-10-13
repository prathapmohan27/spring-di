package com.dependencyinjection.spring.spring_di.controllers;

import com.dependencyinjection.spring.spring_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectControllerTest {

    @Autowired
    SetterInjectController setterInjectController;

    @Test
    void sayHello() {
        System.out.println(setterInjectController.sayHello());
    }
}