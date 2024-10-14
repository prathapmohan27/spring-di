package com.dependencyinjection.spring.spring_di.controllers.i18n;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
class MyI18nControllerENTest {

    @Autowired
    MyI18nController myi18NController;

    @Test
    void sayHello() {

        System.out.println(myi18NController.sayHello());
    }
}