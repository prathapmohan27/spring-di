package com.dependencyinjection.spring.spring_di.controllers;

import com.dependencyinjection.spring.spring_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class propertyInjectControllerTest {

    propertyInjectController propertyInjectController;

    @BeforeEach
    void setUp() {
        propertyInjectController = new propertyInjectController();
        propertyInjectController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectController.sayHello());
    }
}