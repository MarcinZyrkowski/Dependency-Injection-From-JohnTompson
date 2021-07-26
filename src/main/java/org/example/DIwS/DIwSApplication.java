package org.example.DIwS;

import org.example.DIwS.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIwSApplication {

	public static void main(String[] args){
		ApplicationContext ctx = SpringApplication.run(DIwSApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println("= = = Primary bean = = =");
		System.out.println(controller.sayHello());

		System.out.println(" = = = property = = = ");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)
				ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println(" = = = setter = = = ");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(
				"setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println(" = = = constructor = = = ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(
				"constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


		System.out.println("----------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		// temp

	}

}
