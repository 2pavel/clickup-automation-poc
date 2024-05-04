package com.clickup.gui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class UserCtxPage extends PageObject {

    @FindBy(css = "[data-test='dropdown-list-item__Log out']")
    private WebElementFacade logoutBtn;

    @FindBy(css = "[data-test=dropdown-list-item__Settings]")
    private WebElementFacade settingsBtn;

    public void clickSettingsBtn() {
        settingsBtn.click();
    }

    public void clickLogoutBtn() {
        logoutBtn.click();
    }
}
