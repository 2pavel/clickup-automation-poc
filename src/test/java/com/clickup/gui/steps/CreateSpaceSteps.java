package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.CreateSpaceModalPage;

public class CreateSpaceSteps extends TestBase {

    CreateSpaceModalPage createSpaceModalPage;

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
}
