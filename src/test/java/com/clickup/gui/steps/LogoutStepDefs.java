package com.clickup.gui.steps;

import net.serenitybdd.annotations.Steps;

public class LogoutStepDefs {

    @Steps
    LogoutSteps logoutSteps;

    public void clickLogoutBtn() {
        logoutSteps.clickLogoutBtn();
    }
}
