package io.arrogantprogrammer;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @Inject
    QuotesService quotesService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return greetingService.randomGreeting().getValue();
    }

    @GET
    @Path("/quote")
    @Produces(MediaType.TEXT_PLAIN)
    public String quote() {
        Quote quote = quotesService.randomQuote();
        return String.format("\"%s\" - %s", quote.getText(), quote.getAuthor());
    }

}
