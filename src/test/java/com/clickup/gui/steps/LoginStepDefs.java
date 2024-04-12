package com.clickup.gui.steps;

import com.clickup.gui.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefs {

    @Steps
    LoginSteps loginSteps;

    LoginPage loginPage;

    @When("I click login button")
    public void i_click_login_button() {
        loginSteps.openLoginForm();
    }

    @Then("login form is displayed")
    public void login_form_is_displayed() {
        assertThat(loginPage.getLoginMainForm().isDisplayed())
                .as("Login form should be displayed but wasn't!")
                .isTrue();
        // TODO: move assertions
    }

    @When("I sign in as user")
    public void i_sign_in_as_user() {
        loginPage.getLoginField().sendKeys("test");
    }

    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
