package com.clickup.gui.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Wait {

    public static void forAllListElementsToBeVisible(List<WebElementFacade> elements) {
        elements.forEach(WebElementFacade::waitUntilVisible);
    }

    public static void forElementToContainClass(WebElementFacade element, String expectedClass) {
        element.waitForCondition().until(
                ExpectedConditions.attributeContains(element, "class", expectedClass)
        );
    }

}
