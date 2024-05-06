package com.clickup.gui.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class ToastPage extends PageObject {

    @FindBy(css = "[data-test='toast__name-link']")
    private WebElementFacade generalToastTitle;

    @FindBy(css = "[data-test=undo-toast-items__toast-undo]")
    private WebElementFacade taskRemovedToast;

}
