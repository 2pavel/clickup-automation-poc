package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class ProjectMainViewPage extends PageObject {

    @FindBy(css = "span[data-test^=task-row-main__]")
    private List<WebElementFacade> mainViewTasksList;

    @FindBy(css = "[data-test=task-row-menu__ellipsis-v3-button]")
    private List<WebElementFacade> tasksContextMenuBtnsList;

    @FindBy(css = "cu-editable[data-test=task-row-main]")
    private List<WebElementFacade> editableTaskRows;

    public void clickTaskCtxBtn(String btnLocator) {
        WebElementFacade taskCtxBtn = findBy(btnLocator);
        CommonMethodsGUI.clickOnElement(taskCtxBtn);
    }

    public void clickTaskRenameBtn(String btnLocator) {
        WebElementFacade taskRenameBtn = findBy(btnLocator);
        CommonMethodsGUI.clickOnElement(taskRenameBtn);
        taskRenameBtn.waitUntilNotVisible();
    }

    public void clickTaskByName(String taskName) {
        WebElementFacade taskLabel = CommonMethodsGUI.getElementFromListByText(mainViewTasksList, taskName);
        CommonMethodsGUI.clickOnElement(taskLabel);
    }

}
