package com.clickup.gui.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends PageObject {

    @FindBy(css = "[data-test=avatar]")
    private WebElementFacade userAvatar;
}
