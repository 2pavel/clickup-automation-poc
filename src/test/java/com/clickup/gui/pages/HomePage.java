package com.clickup.gui.pages;

import com.clickup.gui.utils.CommonMethodsGUI;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends PageObject {

    @FindBy(css = "[data-test=avatar]")
    private WebElementFacade userAvatar;

    @FindBy(css = "cu-global-actions-bar")
    private WebElementFacade topPageBar;

    @FindBy(css = "[data-test^=simple-bar__workspace]")
    private WebElementFacade workspaceTitleDropdown;

    @FindBy(css = "[data-test=simple-sidebar]")
    private WebElementFacade leftSidebar;

    @FindBy(css = "[data-test^=location-header__views]")
    private WebElementFacade locationHeaderBar;

    @FindBy(css = "[data-test^=dashboard__body]")
    private WebElementFacade dashboard;

    public void clickUserAvatar() {
        CommonMethodsGUI.clickOnElement(userAvatar);
    }
}
