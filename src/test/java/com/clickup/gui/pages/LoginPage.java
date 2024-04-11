package com.clickup.gui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(css = ".login-page-new__main-form")
    private WebElementFacade pageTitle;

    @FindBy(css = ".login-page-new__main-form")
    private WebElementFacade loginMainForm;
}
