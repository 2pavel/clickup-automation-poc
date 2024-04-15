package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.gui.pages.LoginPage;
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
        loginSteps.assertThatLoginFormIsDisplayed();
    }

    @When("I sign in as user {string}")
    public void i_sign_in_as_user(String user) {
        loginSteps.loginToApplication();
        // TODO: implement properties for login and password
    }

    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        loginSteps.assertThatHomePageIsDisplayed();
    }

}
