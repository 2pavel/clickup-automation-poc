package com.clickup.gui.steps;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SidebarStepDefs {

    @Steps
    SidebarSteps sidebarSteps;

    @When("I click Create Space button")
    public void i_click_create_space_button() {
        sidebarSteps.clickCreateSpaceBtn();
    }


    @When("I click on delete button in space context menu")
    public void iClickOnDeleteButtonInSpaceContextMenu() {

    }
}
