package com.dependencyinjection.spring.spring_di;

import com.dependencyinjection.spring.spring_di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

}
