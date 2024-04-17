package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.CreateSpaceModalPage;
import com.clickup.gui.pages.SidebarPage;
import com.clickup.gui.utils.CommonMethodsGUI;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SpacesSteps extends TestBase {

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
        List<String> allSpaces = CommonMethodsGUI.getTextFromListOfElements(sidebarPage.getListOfSpaces());
        assertThat(allSpaces.contains(spaceName))
                .as("Space with name '" + spaceName + "' was not found!")
                .isTrue();
    }
}
