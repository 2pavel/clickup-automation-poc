package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.gui.TestBase;
import com.clickup.gui.pages.HomePage;
import com.clickup.gui.pages.UserCtxPage;
import com.clickup.gui.pages.UserSettingsPage;
import com.clickup.gui.utils.CommonMethodsGUI;
import org.assertj.core.api.SoftAssertions;

public class SettingsSteps extends TestBase {

    HomePage homePage;

    UserCtxPage userCtxPage;

    UserSettingsPage userSettingsPage;

    public void openUserCtxMenu() {
        homePage.clickUserAvatar();
        // TODO: move to a new class for top bar actions
    }

    public void openUserSettingsPage() {
        userCtxPage.clickSettingsBtn();
    }

    public void scrollToPreferences() {
        CommonMethodsGUI.scrollToElement(userSettingsPage.getPreferencesHeader());
    }

    public void assertAllPreferenceLabelsAreDisplayed() {
        // TODO: add assertions
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(Constants.TOAST)
                .isEqualTo(userSettingsPage.getPreferencesLabels().get(0).getText());
    }

}
