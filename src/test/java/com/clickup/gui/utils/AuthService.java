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
//        currentUserName = null;
//        currentAccessToken = null;
//    }

    @Step
    public static RequestSpecification getCurrentAuthorization() {
        return currentAuthorization;
    }
//
//    @Step
//    public static RequestSpecBuilder getRequestSpecBuilder() {
//        return requestSpecBuilder;
//    }

//    @Step
//    public static String getCurrentAccessToken() {
//        return currentAccessToken;
//    }
//
//    @Step
//    public static void prepareUserAuthorization(String userName) {
//        currentUserName = userName;
//        CfgUsers.CfgUser user = Actors.getUserByName(userName);
//        prepareUserAuthorization(user.getEmail(), user.getPassword());
//    }
//
//    @Step
//    public static void prepareUserAuthorization(String userName, String userPassword) {
//        currentAccessToken = getAccessToken(userName, userPassword);
//        prepareApiConfiguration();
//        requestSpecBuilder.addHeader("authorization", "Bearer " + currentAccessToken);
//        currentAuthorization = requestSpecBuilder.build();
//    }
//
//    @Step
//    private static String getAccessToken(String username, String password) {
//        String credentialsBase64 = new String(Base64.getEncoder().encode((Constants.AUTH_SERVICE_USER + ":" + Constants.AUTH_SERVICE_PASSWORD).getBytes()));
//        Response response = given().log().uri()
//                .header("authorization", "Basic " + credentialsBase64)
//                .baseUri(Constants.BASE_URL + "/")
//                .contentType("application/x-www-form-urlencoded")
//                .formParam("username", username)
//                .formParam("password", password)
//                .formParam("grant_type", "password")
//                .post(Constants.AUTHORIZATION_TOKEN)
//                .then()
//                .extract()
//                .response();
//        int responseCode = response.statusCode();
//        if (responseCode != 200) {
//            throw new RuntimeException("Incorrect response code [" + responseCode + "] when trying to get token for [" + username + "]");
//        }
//        return response.jsonPath().getString("access_token");
//    }
}
