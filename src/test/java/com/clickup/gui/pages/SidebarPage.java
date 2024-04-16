package com.clickup.gui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SidebarPage extends PageObject {

    @FindBy(css = ".create-project-row__text")
    private WebElementFacade createSpaceBtn;
}
