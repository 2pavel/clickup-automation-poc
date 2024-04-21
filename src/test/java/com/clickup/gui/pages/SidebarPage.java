package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class SidebarPage extends PageObject {

    @FindBy(css = ".sidebar-v3[role=navigation]")
    private WebElementFacade sidebar;

    @FindBy(css = ".create-project-row__text")
    private WebElementFacade createSpaceBtn;

    @FindBy(css = ".sidebar-project-row[data-test^=project-list-bar-item__link]")
    private List<WebElementFacade> listOfSpacesRows;

    @FindBy(css = "span[data-test^=project-row__name__]")
    private List<WebElementFacade> listOfSpacesWithNames;

    @FindBy(css = "[data-test^=project-row__ellipsis__]")
    private List<WebElementFacade> listOfSpaceSettingsBtns;

    public void clickCreateSpaceBtn() {
        CommonMethodsGUI.clickOnElement(createSpaceBtn);
    }

    public void clickSpaceSettingsBtn(String spaceNameCssLocatorByName) {
        WebElementFacade settingsBtn = findBy(spaceNameCssLocatorByName);
        CommonMethodsGUI.clickOnElement(settingsBtn);
    }

    private WebElementFacade findSpaceRowByName(String spaceName) {
        return CommonMethodsGUI.getElementFromListByText(listOfSpacesWithNames, spaceName);
    }


}
