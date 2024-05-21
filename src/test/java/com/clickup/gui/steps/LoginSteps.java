package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.commons.pojo.Actors;
import com.clickup.gui.TestBase;
import com.clickup.gui.pages.HomePage;
import com.clickup.gui.pages.LandingPage;
import com.clickup.gui.pages.LoginPage;
import org.assertj.core.api.SoftAssertions;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps extends TestBase {

    LandingPage landingPage;
    LoginPage loginPage;
    HomePage homePage;

    public void openLoginForm() {
        log().info("Clicking login button");
        landingPage.clickLogin();
    }

    public void loginToApplication(String username) {
        log().info("Attempting to enter login data for user {}", username);
        enterEmailOfUser(username);
        enterPasswordOfUser(username);
        loginPage.clickLogin();
    }

    public void loginToApplication() {
        log().info("Attempting login as default user");
        loginToApplication(Constants.DEFAULT_USER);
    }

    public void enterEmailOfUser(String userLastName) {
        String email = Actors.getUserByUsername(userLastName).getEmail();
        loginPage.getLoginField().type(email);
    }

    public void enterPasswordOfUser(String userLastName) {
        String password = Actors.getUserByUsername(userLastName).getPassword();
        loginPage.getPasswordField().type(password);
    }

    public void clickLogin() {
        loginPage.clickLogin();
    }

    public void assertThatLoginFormIsDisplayed() {
        log().info("Checking if login form is displayed");
        assertThat(loginPage.getLoginMainForm().isDisplayed())
                .as("Login form should be displayed but wasn't!")
                .isTrue();
    }

    public void assertThatHomePageIsDisplayed() {
        log().info("Checking if home page elements are displayed");
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(homePage.getUserAvatar().isDisplayed())
                .as("User avatar should be displayed but wasn't!")
                .isTrue();
        softly.assertThat(homePage.getTopPageBar().isDisplayed())
                .as("Top page bar with search input should be displayed but wasn't!")
                .isTrue();
        softly.assertThat(homePage.getWorkspaceTitleDropdown().isDisplayed())
                .as("Workspace title should be displayed but wasn't!")
                .isTrue();
        softly.assertThat(homePage.getLeftSidebar().isDisplayed())
                .as("Left sidebar should be displayed but wasn't!")
                .isTrue();
        softly.assertThat(homePage.getLocationHeaderBar().isDisplayed())
                .as("Header bar with location breadcrumbs should be displayed but wasn't!")
                .isTrue();
        softly.assertThat(homePage.getDashboard().isDisplayed())
                .as("Main dashboard should be displayed but wasn't!")
                .isTrue();
        softly.assertAll();
    }
}
