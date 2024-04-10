package com.clickup.gui.steps;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class LandingPageStepDefs {

    @Steps
    LandingPageSteps landingPageSteps;

    @Given("I am on base page")
    public void i_am_on_base_page() {
        landingPageSteps.open();
    }
}
