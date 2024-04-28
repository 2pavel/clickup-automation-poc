package com.clickup.gui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TaskCtxPage extends PageObject {

    @FindBy(css = "[data-test=quick-actions-menu__delete-task]")
    private WebElementFacade deleteBtn;

    public void clickDeleteBtn() {
        deleteBtn.click();
    }
}
