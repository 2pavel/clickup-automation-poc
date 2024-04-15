package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.gui.pages.HomePage;
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

    HomePage homePage;

    @When("I click login button")
    public void i_click_login_button() {
        loginSteps.openLoginForm();
    }

    @Then("login form is displayed")
    public void login_form_is_displayed() {
        loginSteps.assertThatLoginFormIsDisplayed();
    }

    @When("I sign in as user")
    public void i_sign_in_as_user() {
        loginPage.getLoginField().type(Constants.getLogin());
        loginPage.getPasswordField().type(Constants.getPassword());
        loginPage.getLoginBtn().click();
        // TODO: implement properties for login and password
        // TODO: create common GUI methods
    }

    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        loginSteps.assertThatHomePageIsDisplayed();
    }

}
