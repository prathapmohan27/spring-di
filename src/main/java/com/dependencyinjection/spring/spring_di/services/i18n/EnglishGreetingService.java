package com.dependencyinjection.spring.spring_di.services.i18n;

import com.dependencyinjection.spring.spring_di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String greet() {
        return  "Hello from English";
    }
}
