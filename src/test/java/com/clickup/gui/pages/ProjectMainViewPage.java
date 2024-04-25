package com.clickup.gui.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class ProjectMainViewPage extends PageObject {

    @FindBy(css = "span[data-test^=task-row-main__]")
    private List<WebElementFacade> mainViewTasksList;
}
