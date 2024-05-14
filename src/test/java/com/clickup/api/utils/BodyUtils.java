package com.clickup.api.utils;

import net.datafaker.Faker;
import org.json.JSONObject;

public class BodyUtils {

    private static Faker faker = new Faker();

    public static String getBodyFromPojo(Object object) {
        return new JSONObject(object).toString();
    }

    public static String getRandomDescriptionBody() {
        String randomPart = faker.book().title();
        return "{ \"description\": \"" + randomPart + "\" }";
    }

}
