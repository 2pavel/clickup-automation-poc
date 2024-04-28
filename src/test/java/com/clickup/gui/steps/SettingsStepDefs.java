package com.clickup.gui.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SettingsStepDefs {

    @Steps
    SettingsSteps settingsSteps;

    @When("I click on settings button in user context menu")
    public void i_click_on_settings_button_in_user_context_menu() {
        settingsSteps.openUserCtxMenu();
        settingsSteps.openUserSettingsPage();
    }
    @Then("All preference toggles are displayed")
    public void all_preference_toggles_are_displayed() {
        settingsSteps.assertAllPreferenceLabelsAreDisplayed();
    }
}
