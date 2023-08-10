package io.arrogantprogrammer;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class QuotesService {

    List<Quote> quoteList = new ArrayList<Quote>(){{
        add(new Quote("He's a good man... And thorough.", "Maude Lebowski"));
        add(new Quote("Forget it, Donny. You're out of your element!", "Walter Sobchak"));
        add(new Quote("That rug really tied the room together.", "The Dude"));
        add(new Quote("Yeah, well, you know, that's just like, uh, your opinion, man.", "The Dude"));
        add(new Quote("Nice marmot.", "The Dude"));
        add(new Quote("This will not stand, ya know, this aggression will not stand, man.", "The Dude"));
    }};

    public Quote randomQuote() {
        return quoteList.get(new Random().nextInt(0, quoteList.size()));
    }

}
