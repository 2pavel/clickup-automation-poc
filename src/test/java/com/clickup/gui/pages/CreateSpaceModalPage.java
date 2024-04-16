package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class CreateSpaceModalPage extends PageObject {

    @FindBy(css = "[data-test=create-space-details__input]:first-of-type")
    private WebElementFacade spaceNameInput;

    @FindBy(css = "[data-test=create-space-details__continue-button]")
    private WebElementFacade continueBtn;

    @FindBy(css = "[data-test=create-test-workflow__create-space-button]")
    private WebElementFacade createSpaceBtn;

    public void typeIntoSpaceNameInput(String text) {
        spaceNameInput.type(text);
    }

    public void clickContinueBtn() {
        CommonMethodsGUI.clickOnElement(continueBtn);
    }

    public void clickCreateSpaceBtn() {
        CommonMethodsGUI.clickOnElement(createSpaceBtn);
    }

}
