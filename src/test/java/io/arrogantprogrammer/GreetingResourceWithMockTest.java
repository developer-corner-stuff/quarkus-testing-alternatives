package io.arrogantprogrammer;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
public class GreetingResourceWithMockTest {

    @InjectMock
    QuotesService quotesService;


    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Random greeting!"));
    }

    @Test
    public void testQuoteEndpoint() {

        Mockito.when(
                quotesService.randomQuote())
                .thenReturn(new Quote("Sometimes you eat the bear, and sometimes, well, he eats you.", "The Stranger"));

        given()
                .when().get("/quote")
                .then()
                .statusCode(200)
                .body(containsString("Stranger"));
    }

    @Test
    public void testCastEndpoint() {

        given()
                .when().get("/cast")
                .then()
                .statusCode(200)
                .body(anyOf(containsString("Dude"),
                        containsString("Maude"),
                        containsString("Donny"),
                        containsString("Walter"),
                        containsString("Jesus")));
    }

}
