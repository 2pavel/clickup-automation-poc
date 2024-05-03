package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class TaskViewModalPage extends PageObject {

    @FindBy(css = "div.cu-task-view__container")
    private WebElementFacade taskViewContainer;

    @FindBy(css = "textarea[data-test^=task-title]")
    private WebElementFacade taskNameField;

    public void typeIntoTaskNameField(String text) {
        taskNameField.type(text);
    }
}
