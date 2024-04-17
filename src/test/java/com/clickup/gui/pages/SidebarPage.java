package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class SidebarPage extends PageObject {

    @FindBy(css = ".create-project-row__text")
    private WebElementFacade createSpaceBtn;

    @FindBy(css = ".sidebar-project-row[data-test^=project-list-bar-item__link]")
    private List<WebElementFacade> listOfSpacesRows;

    @FindBy(css = "span[data-test^=project-row__name__]")
    private List<WebElementFacade> listOfSpaces;

    public void clickCreateSpaceBtn() {
        CommonMethodsGUI.clickOnElement(createSpaceBtn);
    }

}
