package com.clickup.commons.pojo;

import com.clickup.gui.utils.JsonUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Actors {

    private static Map<String, CfgUsers.CfgUser> users;

    private static Map<String, CfgUsers.CfgUser> readUsers() {
        try {
            String userNode = JsonUtils.getJsonNode("users");
            ObjectMapper mapper = new ObjectMapper();
            CfgUsers pojoUsers = mapper.readValue(userNode, CfgUsers.class);
            return pojoUsers.getUsers();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static CfgUsers.CfgUser getUserByLastName(String userLastName) {
        if (users == null) {
            users = readUsers();
        }
        if (!users.containsKey(userLastName)) {
            throw new IllegalArgumentException("Could not find user with last name: " + userLastName);
        }
        return users.get(userLastName);
    }
}
