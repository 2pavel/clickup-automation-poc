package com.clickup.api.steps.hooks;

import com.clickup.api.utils.AuthService;
import io.cucumber.java.BeforeAll;



public class HookStepDefs {

    @BeforeAll()
    public static void beforeAll() {
        AuthService.prepareApiConfiguration();
    }
}
