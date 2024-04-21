package com.clickup.gui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        spacesSteps.assertThatSpaceIsVisible();
    }

    @When("confirm deletion in safeguard form")
    public void confirm_deletion_in_safeguard_form() {
        spacesSteps.fillSafeguardForm();
        spacesSteps.confirmDeletion();
    }

    @Then("the space is removed")
    public void the_space_is_removed() {
        spacesSteps.assertThatSpaceIsNotVisible();
    }
}
