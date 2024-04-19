package com.clickup.gui.utils;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.core.Serenity.getDriver;

public class CommonMethodsGUI {

    private static JavascriptExecutor javascriptExecutor;

    public static void markElementWithColor(WebElementFacade element) {
//        javascriptExecutor = (JavascriptExecutor) getDriver();
//        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = 'lightblue'", element);
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

    public static void hoverOverElement(WebElementFacade element) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element).perform();
        markElementWithColor(element);
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

    public static WebElementFacade getElementFromListByText(List<WebElementFacade> listOfElements, String text) {
        for (WebElementFacade element : listOfElements) {
            if (element.containsText(text)) {
                return element;
            }
        }
        return null;
        // TODO: handle it in a better way
    }

    public static String buildDataTestLocator(String base, String suffix) {
        return "[data-test='" + base + suffix + "']";
    }
}
