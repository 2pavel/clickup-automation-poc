package com.clickup.gui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SidebarSpaceCtxPage extends PageObject {

    @FindBy(css = "a.nav-menu-item__delete_space")
    private WebElementFacade deleteBtn;

    public void clickDeleteBtn() {
        deleteBtn.click();
    }
}
