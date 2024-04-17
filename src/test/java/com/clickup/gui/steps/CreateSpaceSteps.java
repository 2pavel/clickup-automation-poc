package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.CreateSpaceModalPage;
import com.clickup.gui.pages.SidebarPage;

public class CreateSpaceSteps extends TestBase {

    CreateSpaceModalPage createSpaceModalPage;

    SidebarPage sidebarPage;

    public void enterSpaceName() {
        // TODO: add space name to constants
        createSpaceModalPage.typeIntoSpaceNameInput("TestSpace");
    }

    public void clickContinueBtn() {
        createSpaceModalPage.clickContinueBtn();
    }

    public void clickCreateSpaceBtn() {
        createSpaceModalPage.clickCreateSpaceBtn();
    }

    public void assertThatSpaceIsVisible(String spaceName) {
        // TODO: implement
    }
}
