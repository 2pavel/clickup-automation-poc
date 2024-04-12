package com.clickup.gui.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends PageObject {

    @FindBy(css = ".login-page-new__main-form")
    private WebElementFacade pageTitle;

    @FindBy(css = ".login-page-new__main-form")
    private WebElementFacade loginMainForm;

    @FindBy(css = "#login-email-input")
    private WebElementFacade loginField;

    @FindBy(css = "#login-password-input")
    private WebElementFacade passwordField;

}
