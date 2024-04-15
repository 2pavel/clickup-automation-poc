package com.clickup.commons.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class CfgUsers {

    private Map<String, CfgUser> users = new HashMap<>();

    @Getter
    @Setter
    public static class CfgUser {
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String secret;
    }
}
