package io.arrogantprogrammer;

import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
public class MockGreetingService extends GreetingService{

    @Override
    public Greeting randomGreeting() {
        return new Greeting("Random greeting!");
    }
}
