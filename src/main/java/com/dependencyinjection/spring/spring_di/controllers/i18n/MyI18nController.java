package com.dependencyinjection.spring.spring_di.controllers.i18n;

import com.dependencyinjection.spring.spring_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18nController {

    private final GreetingService greetingService;
    public MyI18nController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet();
    }
}
