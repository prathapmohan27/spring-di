package com.dependencyinjection.spring.spring_di.services.i18n;

import com.dependencyinjection.spring.spring_di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hello from Spanish";
    }
}
