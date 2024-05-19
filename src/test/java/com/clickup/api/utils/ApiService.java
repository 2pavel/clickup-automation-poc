package com.clickup.api.utils;

import io.restassured.http.ContentType;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import java.util.Map;

public class ApiService {

    @Step
    public static void runPost(String endpoint) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .post(endpoint);
    }

    @Step
    public static void runPostWithJson(String endpoint, String jsonBody) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .post(endpoint);
    }

    @Step
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
    public static void runGetWithParam(String endpoint, String param, String value) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .queryParam(param, value)
                .get(endpoint);
    }

    @Step
    public static void runGetWithParamsMap(String endpoint, Map<String, String> params) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .queryParams(params)
                .get(endpoint);
    }

    @Step
    public static void assertStatusCode(int statusCode) {
        SerenityRest.restAssuredThat(response -> response.statusCode(statusCode));
    }

}
