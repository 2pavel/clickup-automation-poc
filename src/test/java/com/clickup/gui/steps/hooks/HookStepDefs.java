package com.clickup.gui.steps.hooks;

import com.clickup.gui.steps.LandingPageSteps;
import com.clickup.gui.steps.LoginSteps;
import com.clickup.gui.steps.LogoutSteps;
import com.clickup.gui.steps.SettingsSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;

import java.io.IOException;
import java.util.NoSuchElementException;

public class HookStepDefs {

    @Steps
    LandingPageSteps landingPageSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    SettingsSteps settingsSteps;

    @Steps
    LogoutSteps logoutSteps;

    @Before(value = "@settings")
    public void loginToApplication() {
        landingPageSteps.open();
        loginSteps.openLoginForm();
        loginSteps.loginToApplication();
    }

    @After(value = "@gui and not @user_not_logged_in")
    public void logout() {
        System.out.println("===== Attempting logout =====");
        try {
            settingsSteps.openUserCtxMenu();
            logoutSteps.clickLogoutBtn();
        } catch (NoSuchElementException e) {
            System.out.println("===== No user avatar found, skipping logout =====");
        } catch (ElementShouldBeEnabledException e) {
            System.out.println("===== User ctx menu not enabled, skipping logout =====");
        }
    }

    @After(value = "@user_not_logged_in")
    public static void failsafeTeardown() {
        try {
            System.out.println("Attempting taskkill");
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: figure out why @user_not_logged_in test leaves some instances running
    //  ~~consider adding a hook to manually quit~~ <- that made it even worse
    //  taskkill solution works for now
    //  make it better and leave this note here for multi-browser implementation

    // TODO: add logger in this class or make a steps class with logger
}
