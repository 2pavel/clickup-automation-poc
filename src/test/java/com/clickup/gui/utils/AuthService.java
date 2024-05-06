package com.clickup.gui.utils;

import com.clickup.commons.Constants;
import com.clickup.commons.Endpoints;
import com.clickup.commons.pojo.CfgUsers;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.annotations.Step;

import java.util.Base64;
import java.util.Map;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class AuthService {

    private static Properties api = PropertiesLoader.loadApiProperties();
    private static RequestSpecBuilder requestSpecBuilder;
    private static RequestSpecification currentAuthorization;

    @Step
    public static void prepareApiConfiguration() {
        requestSpecBuilder = new RequestSpecBuilder()
                .setBaseUri(Endpoints.BASE_URL)
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", api.getProperty("api_token"))
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter());
        currentAuthorization = requestSpecBuilder.build();
    }

//    @Step
//    public static void removeCurrentAuthorization() {
//        requestSpecBuilder = null;
//        currentAuthorization = null;
//    }

    @Step
    public static RequestSpecification getCurrentAuthorization() {
        return currentAuthorization;
    }

//    @Step
//    public static RequestSpecBuilder getRequestSpecBuilder() {
//        return requestSpecBuilder;
//    }

}
