package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ControllerRowPage extends PageObject {

    @FindBy(css = "[data-test=create-task-menu__new-task-button][cu3-size=small]")
    private WebElementFacade addTaskBtn;

    public void clickAddTaskBtn() {
        CommonMethodsGUI.clickOnElement(addTaskBtn);
    }
}
