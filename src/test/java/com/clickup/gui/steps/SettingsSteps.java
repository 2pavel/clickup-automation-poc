package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.gui.TestBase;
import com.clickup.gui.pages.HomePage;
import com.clickup.gui.pages.UserCtxPage;
import com.clickup.gui.pages.UserSettingsPage;
import com.clickup.gui.utils.CommonMethodsGUI;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
        List<WebElementFacade> preferenceLabels = userSettingsPage.getPreferencesLabels();
        List<String> preferenceLabelsText = CommonMethodsGUI.getTextFromListOfElements(preferenceLabels);

        assertThat(preferenceLabelsText.containsAll(Constants.PREFERENCES)).isTrue();
    }

}
