package com.clickup.gui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SidebarStepDefs {

    @Steps
    SidebarSteps sidebarSteps;

    @Given("sidebar is not collapsed")
    public void sidebar_is_not_collapsed() {
        sidebarSteps.assertThatSidebarIsNotCollapsed();
    }

    @When("I click Create Space button")
    public void i_click_create_space_button() {
        sidebarSteps.clickCreateSpaceBtn();
    }

    @When("I click on delete button in space context menu")
    public void i_click_on_delete_button_in_space_context_menu() {
        sidebarSteps.clickDeleteSpaceBtn();
    }
}
