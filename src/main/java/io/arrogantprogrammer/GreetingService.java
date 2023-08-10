package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class GreetingService {

    static final Logger LOGGER = LoggerFactory.getLogger(GreetingService.class);
    List<Greeting> greetingList = new ArrayList(){{
        add(new Greeting("Hello!"));
        add(new Greeting("Bonjour!"));
        add(new Greeting("Hallo!"));
        add(new Greeting("Hej!"));
        add(new Greeting("Hola!"));
    }};

    public Greeting randomGreeting() {
        return greetingList.get(new Random().nextInt(0, greetingList.size()));
    }


}
