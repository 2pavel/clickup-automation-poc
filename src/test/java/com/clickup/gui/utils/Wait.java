package com.clickup.gui.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class Wait {

    public static void forAllListElementsToBeVisible(List<WebElementFacade> elements) {
        elements.forEach(WebElementFacade::waitUntilVisible);
    }
}
