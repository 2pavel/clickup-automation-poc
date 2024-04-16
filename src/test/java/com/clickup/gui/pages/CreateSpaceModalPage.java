package com.clickup.gui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CreateSpaceModalPage extends PageObject {

    @FindBy(css = "[data-test=create-space-details__input]:first-of-type")
    private WebElementFacade spaceNameInput;

    @FindBy(css = "[data-test=create-space-details__continue-button]")
    private WebElementFacade continueBtn;

    @FindBy(css = "[data-test=create-test-workflow__create-space-button]")
    private WebElementFacade createSpaceBtn;


}
