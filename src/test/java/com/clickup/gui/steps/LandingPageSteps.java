package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.LandingPage;

public class LandingPageSteps extends TestBase {

    LandingPage landingPage;

    public void open() {
        log().info("Opening landing page");
        landingPage.open();
    }
}
