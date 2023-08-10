package io.arrogantprogrammer;

import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

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
        given()
                .when().get("/quote")
                .then()
                .statusCode(200)
                .body(CoreMatchers.anyOf(containsString("Dude"), containsString("Maude"), containsString("Walter")));
    }

}