package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

import javax.annotation.Priority;

@Alternative
@Priority(1)
@ApplicationScoped
public class AlternativeCastService extends CastService{

    @Override
    public CastMember randomCastMember() {
        return new CastMember("David Huddleston", "The Big Lebowski");
    }
}
