package com.clickup.gui.steps.hooks;

import com.clickup.gui.steps.LandingPageSteps;
import com.clickup.gui.steps.LoginSteps;
import com.clickup.gui.steps.LogoutSteps;
import com.clickup.gui.steps.SettingsSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Steps;

public class HookStepDefs {

    @Steps
    LandingPageSteps landingPageSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    SettingsSteps settingsSteps;

    @Steps
    LogoutSteps logoutSteps;

    @Before(value = "@settings")
    public void loginToApplication() {
        landingPageSteps.open();
        loginSteps.openLoginForm();
        loginSteps.loginToApplication();
    }

    @After(value = "not @api and not @user_not_logged_in")
    public void logout() {
        settingsSteps.openUserCtxMenu();
        logoutSteps.clickLogoutBtn();
    }

    // TODO: figure out why using TestRunner leaves some instances running
    //  consider adding a hook to manually quit
}
