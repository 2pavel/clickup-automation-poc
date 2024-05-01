package com.clickup.gui.steps.hooks;

import com.clickup.gui.steps.LandingPageSteps;
import com.clickup.gui.steps.LoginSteps;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Steps;

public class HookSteps {

    @Steps
    LandingPageSteps landingPageSteps;

    @Steps
    LoginSteps loginSteps;

    @Before(value = "@settings")
    public void loginToApplication() {
        landingPageSteps.open();
        loginSteps.openLoginForm();
        loginSteps.loginToApplication();
    }
}
