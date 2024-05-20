package com.clickup.api.steps.hooks;

import com.clickup.api.steps.FoldersSteps;
import com.clickup.api.steps.GoalsSteps;
import com.clickup.api.utils.AuthService;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class HookStepDefs {

    @BeforeAll
    public static void beforeAll() {
        AuthService.prepareApiConfiguration();
    }

    @AfterAll
    public static void afterAll() {
        FoldersSteps.deleteTestFolder();
        GoalsSteps.deleteTestGoal();
    }

}
