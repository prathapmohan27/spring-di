package com.dependencyinjection.spring.spring_di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ConstructorInjectControllerTest {

    @Autowired
    ConstructorInjectController constructorInjectController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectController.sayHello());
    }
}