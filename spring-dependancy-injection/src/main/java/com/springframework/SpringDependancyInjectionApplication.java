package com.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springframework.controller.ConstructorInjectedController;
import com.springframework.controller.I18NController;
import com.springframework.controller.MyController;
import com.springframework.controller.PropertyInjectedController;
import com.springframework.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDependancyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDependancyInjectionApplication.class,
				args);
		
		I18NController i18nController = (I18NController) context.getBean("i18NController");
		System.out.println(i18nController.sayHello());
		
		System.out.println("===========primary bean");
		MyController bean =(MyController) context.getBean("myController");
		System.out.println(bean.sayHello());
		
		System.out.println("===========property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("===========Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		
		System.out.println("===========Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
		
		
	}

}
