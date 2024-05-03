package com.clickup.gui.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.core.Serenity.getDriver;

public class CommonMethodsGUI {

    private static JavascriptExecutor javascriptExecutor;

    private static Logger logger = LogManager.getLogger();

    private static Logger log() {
        return logger;
    }

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
    }

    public static void hoverOverElement(WebElementFacade element) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element).perform();
        markElementWithColor(element);
    }

    public static boolean isElementDisplayed(WebElementFacade element) {
        markElementWithColor(element);
        return element.isDisplayed();
        // TODO: consider using this mechanism in all tests
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
                log().info("Found element containing text: {}", text);
                return element;
            }
        }
        log().warn("Element containing '{}' was not found!", text);
        return null;
    }

    public static String buildDataTestLocator(String base, String suffix) {
        return "[data-test='" + base + suffix + "']";
    }

    public static void typeByActions(String text) {
        Actions actions = new Actions(getDriver());
        actions.sendKeys(text).perform();
    }

    public static void pressEnter() {
        Actions actions = new Actions(getDriver());
        actions
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .perform();
    }

    // TODO: only push when this method has no usages
    public static void yikes(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
