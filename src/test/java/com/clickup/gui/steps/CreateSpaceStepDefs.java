package com.clickup.gui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class CreateSpaceStepDefs {

    @Steps
    CreateSpaceSteps createSpaceSteps;

    @And("go through space creation process")
    public void goThroughSpaceCreationProcess() {
        createSpaceSteps.enterSpaceName();
        createSpaceSteps.clickContinueBtn();
        createSpaceSteps.clickCreateSpaceBtn();
    }

    @Then("Newly created space is visible")
    public void newlyCreatedSpaceIsVisible() {
        createSpaceSteps.assertThatSpaceIsVisible("TestSpace");
        // TODO: implement
    }
}
