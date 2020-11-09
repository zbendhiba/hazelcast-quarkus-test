package org.acme.resteasy;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.hazelcast.HazelcastServerTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
@QuarkusTestResource(HazelcastServerTestResource.class)
public class ExampleResourceTest {
    @Test
    public void testTopic() {
        given()
                .when().get("/test/topic")
                .then()
                .statusCode(200);
    }

    @Test
    public void testReliableTopic() {
        given()
                .when().get("/test/topic-reliable")
                .then()
                .statusCode(200);
    }

    @Test
    public void testMap() {
        given()
                .when().get("/test/map")
                .then()
                .statusCode(200);
    }


    @Test
    public void testQueue() {
        given()
                .when().get("/test/queue")
                .then()
                .statusCode(200);
    }

    @Test
    public void testMultimap() {
        given()
                .when().get("/test/queue")
                .then()
                .statusCode(200);
    }

    @Test
    public void testReplicatedMap() {
        given()
                .when().get("/test/replicated-map")
                .then()
                .statusCode(200);
    }

    @Test
    public void testList() {
        given()
                .when().get("/test/list")
                .then()
                .statusCode(200);
    }

}