package com.clickup.gui.steps;

import com.clickup.gui.pages.LandingPage;

public class LoginSteps {

    LandingPage landingPage;

    public void openLoginForm() {
        landingPage.clickLogin();
    }
}