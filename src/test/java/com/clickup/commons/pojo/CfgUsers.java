package com.clickup.commons.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class CfgUsers {
    public Map<String, CfgUser> getUsers() {
        return users;
    }

    public void setUsers(Map<String, CfgUser> users) {
        this.users = users;
    }

    private Map<String, CfgUser> users = new HashMap<>();


    public static class CfgUser {
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String secret;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getSecret() {
            return secret;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }
    }
}
