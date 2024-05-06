package com.clickup.gui.utils;

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

    @Step
    public static void runGet(String endpoint) {
        SerenityRest
                .given()
                .spec(AuthService.getCurrentAuthorization())
                .contentType(ContentType.JSON)
                .get(endpoint);
    }

}
