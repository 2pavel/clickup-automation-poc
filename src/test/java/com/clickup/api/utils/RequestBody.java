package com.clickup.api.utils;

import org.json.JSONObject;

public class RequestBody {

    public static String getBodyFromPojo(Object object) {
        return new JSONObject(object).toString();
    }

}
