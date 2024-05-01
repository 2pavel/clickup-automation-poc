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

    public void clickTaskCtxBtn(String btnLocator) {
        WebElementFacade taskCtxBtn = findBy(btnLocator);
        CommonMethodsGUI.clickOnElement(taskCtxBtn);
    }

    public void clickTaskRenameBtn(String btnLocator) {
        WebElementFacade taskRenameBtn = findBy(btnLocator);
        CommonMethodsGUI.clickOnElement(taskRenameBtn);
        taskRenameBtn.waitUntilNotVisible();
    }

    public void typeIntoEditedRow(String text) {

        // TODO: try grabbing editable row by waiting for class to change
        //  class="cu-editable cu-task-row-main ng-star-inserted"
        //  class="cu-editable cu-task-row-main ng-star-inserted cu-editable_editing"
        //  -----------------------------------------------------
        //  note: data-test="editable__input" is BS! DO NOT USE!

    }

}
