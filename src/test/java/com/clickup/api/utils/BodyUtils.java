package com.clickup.api.utils;

import com.clickup.commons.Temp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import net.datafaker.Faker;
import org.json.JSONObject;

public class BodyUtils {

    private static Faker faker = new Faker();

//    public static String getBodyFromPojo(Object object) {
//        return new JSONObject(object).toString();
//    }

    public static String getBodyFromPojo(Object object) {
        ObjectWriter ow = new ObjectMapper().writerWithDefaultPrettyPrinter();
        try {
            return ow.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getRandomDescriptionBody() {
        String randomPart = faker.book().title();
        Temp.updatedTaskDescription = randomPart;
        return "{ \"description\": \"" + randomPart + "\" }";
    }

    public static String getSingleFieldBody(String fieldName, String value) {
        return "{ \"" + fieldName + "\": \"" + value + "\" }";
    }

}
