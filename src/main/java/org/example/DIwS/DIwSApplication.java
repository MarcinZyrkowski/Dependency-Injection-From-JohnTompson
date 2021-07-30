package org.example.DIwS;

import org.example.DIwS.config.ConfigBinding;
import org.example.DIwS.config.ConstructorConfig;
import org.example.DIwS.controllers.*;
import org.example.DIwS.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIwSApplication {

    public static void main(String[] args) {
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

        System.out.println("-------- Fake Data Source");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcurl());

        System.out.println("-------- Config Props Bean");
        ConfigBinding configBinding = ctx.getBean(ConfigBinding.class);
        System.out.println(configBinding.getUsername());
        System.out.println(configBinding.getPassword());
        System.out.println(configBinding.getJdbcurl());

        System.out.println("-------- Config constructor biding");
        ConstructorConfig constructorConfig = ctx.getBean(ConstructorConfig.class);
        System.out.println(constructorConfig.getUsername());
        System.out.println(constructorConfig.getPassword());
        System.out.println(constructorConfig.getJdbcurl());

    }

}
