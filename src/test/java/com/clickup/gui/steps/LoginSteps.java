package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.HomePage;
import com.clickup.gui.pages.LandingPage;
import com.clickup.gui.pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends TestBase {

    LandingPage landingPage;
    LoginPage loginPage;
    HomePage homePage;

    public void openLoginForm() {
        log().info("Clicking login button");
        landingPage.clickLogin();
    }

    public void assertThatLoginFormIsDisplayed() {
        log().info("Checking if login form is displayed");
        assertThat(loginPage.getLoginMainForm().isDisplayed())
                .as("Login form should be displayed but wasn't!")
                .isTrue();
    }

    public void assertThatHomePageIsDisplayed() {
        log().info("Checking if home page elements are displayed");
        assertThat(homePage.getUserAvatar().isDisplayed())
                .as("User avatar should be display but wasn't!")
                .isTrue();
        // TODO: expand
    }
}
