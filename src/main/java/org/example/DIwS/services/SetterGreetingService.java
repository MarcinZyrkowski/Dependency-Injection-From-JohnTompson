package org.example.DIwS.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "hello world - setter";
    }

}
