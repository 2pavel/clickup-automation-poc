package com.clickup.gui.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Wait {

    public static void forAllListElementsToBeVisible(List<WebElementFacade> elements) {
        elements.forEach(WebElementFacade::waitUntilVisible);
    }

    public static void forElementToContainAttribute(WebElementFacade element, String attr, String expectedVal) {
        element.waitForCondition().until(
                ExpectedConditions.attributeContains(element, attr, expectedVal)
        );
    }

}
