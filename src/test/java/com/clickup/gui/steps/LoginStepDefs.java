package com.clickup.gui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepDefs {

    @Steps
    LoginSteps loginSteps;

    @When("I click login button")
    public void i_click_login_button() {
        loginSteps.openLoginForm();
    }
    @Then("login form is displayed")
    public void login_form_is_displayed() {

    }

}
