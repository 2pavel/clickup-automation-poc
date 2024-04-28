package com.clickup.gui.pages;

import com.clickup.commons.Constants;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class UserSettingsPage extends PageObject {

    @FindBy(css = "[data-test=profile-settings__empty]")
    private WebElementFacade userAvatar;

    @FindBy(xpath = ".//h2[contains(text(), 'Preferences')]")
    private WebElementFacade preferencesHeader;

    @FindBy(xpath = Constants.PREFERENCES_SECTION_XPATH)
    private WebElementFacade preferencesSection;

    @FindBy(xpath = Constants.PREFERENCES_SECTION_XPATH + "//h3")
    private List<WebElementFacade> preferencesLabels;

    @FindBy(xpath = Constants.PREFERENCES_SECTION_XPATH + "//input[contains(@class, 'switch__checkbox')]")
    private List<WebElementFacade> preferencesToggles;

}
