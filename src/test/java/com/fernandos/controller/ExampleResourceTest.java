package com.fernandos.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
            .statusCode(200)
            .body(is("hello"));
    }

    @Test
    public void testGetNameEndpoint() {
        String name = "Jonas Brother";
        given()
          .pathParam("name", name)
          .when().get("hello/name/{name}")
          .then()
            .statusCode(200)
            .body(is("hello " + name));
    }

}
