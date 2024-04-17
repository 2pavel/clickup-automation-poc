package com.clickup.gui.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.core.Serenity.getDriver;

public class CommonMethodsGUI {

    private static JavascriptExecutor javascriptExecutor;

    public static void markElementWithColor(WebElementFacade element) {
        javascriptExecutor = (JavascriptExecutor) getDriver();
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = 'lightblue'", element);
    }

    public static void scrollToElement(WebElementFacade element) {
        javascriptExecutor = (JavascriptExecutor) getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void clickOnElement(WebElementFacade element) {
        element.waitUntilClickable();
        markElementWithColor(element);
        element.click();
        // TODO: implement in test methods
    }

    public static boolean isElementDisplayed(WebElementFacade element) {
        markElementWithColor(element);
        return element.isDisplayed();
    }

    public static String getTextFromElement(WebElementFacade element){
        markElementWithColor(element);
        return element.getText();
    }

    public static List<String> getTextFromListOfElements(List<WebElementFacade> elements) {
        return elements.stream().map(element -> {
            markElementWithColor(element);
            return element.getText();
        }).collect(Collectors.toList());
    }
}
