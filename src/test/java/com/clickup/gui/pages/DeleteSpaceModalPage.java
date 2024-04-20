package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DeleteSpaceModalPage extends PageObject {

    @FindBy(css = "[data-test=form-field__box] > input")
    private WebElementFacade safeguardSpaceNameField;

    @FindBy(css = "[data-test=confirmation-modal__confirm-button]")
    private WebElementFacade deleteBtn;

    @FindBy(css = "confirmation-modal__cancel-button")
    private WebElementFacade cancelBtn;

    public void typeIntoSafeguardInput(String text) {
        safeguardSpaceNameField.type(text);
    }

    public void clickDeleteBtn() {
        CommonMethodsGUI.clickOnElement(deleteBtn);
    }

    public void clickCancelBtn() {
        CommonMethodsGUI.clickOnElement(cancelBtn);
    }

}
