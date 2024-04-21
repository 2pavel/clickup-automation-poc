package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageObject {

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElementFacade loginBtn;

    public void clickLogin() {
        CommonMethodsGUI.clickOnElement(loginBtn);
    }
}
