package com.clickup.gui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class SpacesStepDefs {

    @Steps
    SpacesSteps spacesSteps;

    @And("go through space creation process")
    public void goThroughSpaceCreationProcess() {
        spacesSteps.enterSpaceName();
        spacesSteps.clickContinueBtn();
        spacesSteps.clickCreateSpaceBtn();
    }

    @Then("Newly created space is visible")
    public void newlyCreatedSpaceIsVisible() {
        spacesSteps.assertThatSpaceIsVisible("TestSpace");
        // TODO: implement
    }
}
