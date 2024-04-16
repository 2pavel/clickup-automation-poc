package com.clickup.commons.pojo;

import com.clickup.gui.utils.JsonUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Actors {

    private static Map<String, CfgUsers.CfgUser> users;

    private static Map<String, CfgUsers.CfgUser> readUsers() {
        try {
            String userNode = JsonUtils.getUserJsonNode("users");
            ObjectMapper mapper = new ObjectMapper();
            CfgUsers pojoUsers = mapper.readValue(userNode, CfgUsers.class);
            return pojoUsers.getUsers();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static CfgUsers.CfgUser getUserByUsername(String username) {
        if (users == null) {
            users = readUsers();
        }
        if (!users.containsKey(username)) {
            System.out.println(users);
            throw new IllegalArgumentException("Could not find user with last name: " + username);
        }
        return users.get(username);
    }
}
