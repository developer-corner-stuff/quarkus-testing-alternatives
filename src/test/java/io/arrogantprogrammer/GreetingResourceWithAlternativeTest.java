package io.arrogantprogrammer;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestProfile(AlternativeCastServiceProfile.class)
public class GreetingResourceWithAlternativeTest {

    @Inject
    CastService castService;

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Random greeting!"));
    }

    @Test
    public void testCastEndpoint() {

        given()
                .when().get("/cast")
                .then()
                .statusCode(200)
                .body(containsString("The Big Lebowski"));
    }

}
