package com.dependencyinjection.spring.spring_di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class MyI18nControllerESTest {

    @Autowired
    private MyI18nController myI18nController;

    @Test
    void sayHello() {
        System.out.println(myI18nController.sayHello());
    }

}