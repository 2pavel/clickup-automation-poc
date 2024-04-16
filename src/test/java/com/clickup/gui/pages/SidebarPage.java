package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SidebarPage extends PageObject {

    @FindBy(css = ".create-project-row__text")
    private WebElementFacade createSpaceBtn;

    public void clickCreateSpaceBtn() {
        CommonMethodsGUI.clickOnElement(createSpaceBtn);
    }
}
