package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class CreateTaskModalPage extends PageObject {

    @FindBy(css = "[data-test=draft-view__quick-create-create]")
    private WebElementFacade createTaskBtn;

    @FindBy(css = "textarea[data-test=draft-view__title-task]")
    private WebElementFacade taskNameField;

    public void clickCreateTaskBtn() {
        CommonMethodsGUI.clickOnElement(createTaskBtn);
    }

    public void typeIntoTaskNameField(String text) {
        taskNameField.type(text);
    }
}
