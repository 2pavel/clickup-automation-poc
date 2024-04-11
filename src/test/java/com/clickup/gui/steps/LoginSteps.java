package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.LandingPage;

public class LoginSteps extends TestBase {

    LandingPage landingPage;

    public void openLoginForm() {
        log().info("Clicking login button");
        landingPage.clickLogin();
    }
}
