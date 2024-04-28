package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.HomePage;
import com.clickup.gui.pages.UserCtxPage;
import com.clickup.gui.pages.UserSettingsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SettingsSteps extends TestBase {

    HomePage homePage;

    UserCtxPage userCtxPage;

    UserSettingsPage userSettingsPage;

    public void openUserCtxMenu() {
        homePage.clickUserAvatar();
    }

    public void openUserSettingsPage() {
        userCtxPage.clickSettingsBtn();
    }

    public void assertAllPreferenceLabelsAreDisplayed() {
        // TODO: implement
        assertThat(userSettingsPage.getUserAvatar().isDisplayed()).isTrue();
    }

}
