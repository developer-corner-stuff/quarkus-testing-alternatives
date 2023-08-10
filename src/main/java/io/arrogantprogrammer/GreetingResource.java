package io.arrogantprogrammer;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @Inject
    QuotesService quotesService;

    @Inject
    CastService castService;

    @GET
    @Path("/hello")
    public String hello() {

        return greetingService.randomGreeting().getValue();
    }

    @GET
    @Path("/quote")
    public String quote() {
        Quote quote = quotesService.randomQuote();
        return String.format("\"%s\" - %s", quote.getText(), quote.getAuthor());
    }

    @GET
    @Path("/cast")
    public String castMember() {
        CastMember castMember = castService.randomCastMember();
        return String.format("%s - %s", castMember.getCharacter(), castMember.getName());
    }


}
