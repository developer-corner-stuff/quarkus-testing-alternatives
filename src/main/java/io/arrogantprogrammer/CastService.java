package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class CastService {

    List<CastMember> castMemberList = new ArrayList<>(){{
        add(new CastMember("Jeff Bridges", "The Dude"));
        add(new CastMember("Julianne Moore", "Maude Lebowski"));
        add(new CastMember("Steve Buscemi", "Donny Kerabatsos"));
        add(new CastMember("John Goodman", "Walter Sobchak"));
        add(new CastMember("John Torturro", "Jesus Quintana"));
    }};

    public CastMember randomCastMember() {
        return castMemberList.get(new Random().nextInt(0, 5));
    }
}
