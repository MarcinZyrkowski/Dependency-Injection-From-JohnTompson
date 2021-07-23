package org.example.DIwS.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String sayHello() {
        return "hello world - property";
    }

}
