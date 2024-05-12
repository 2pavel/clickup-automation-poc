package com.clickup.api.utils;

import io.restassured.http.ContentType;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class ApiService {

    @Step
    public static void runPost(String endpoint) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .post(endpoint);
    }

    public static void runPutWithJson(String endpoint, String jsonBody) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .put(endpoint);
    }

    @Step
    public static void runGet(String endpoint) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .get(endpoint);
    }

    @Step
    public static void assertStatusCode(int statusCode) {
        SerenityRest.restAssuredThat(response -> response.statusCode(statusCode));
    }

}
