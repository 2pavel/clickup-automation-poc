package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.CreateSpaceModalPage;
import com.clickup.gui.pages.DeleteSpaceModalPage;
import com.clickup.gui.pages.SidebarPage;
import com.clickup.gui.utils.CommonMethodsGUI;
import com.clickup.gui.utils.Wait;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SpacesSteps extends TestBase {

    CreateSpaceModalPage createSpaceModalPage;

    DeleteSpaceModalPage deleteSpaceModalPage;

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

    public void fillSafeguardForm(String spaceName) {
        deleteSpaceModalPage.typeIntoSafeguardInput(spaceName);
    }

    public void confirmDeletion() {
        deleteSpaceModalPage.clickDeleteBtn();
        deleteSpaceModalPage.getDialogWindow().waitUntilNotVisible();
    }

    public void assertThatSpaceIsVisible(String spaceName) {
        assertThat(isSpaceWithGivenNameDisplayed(spaceName))
                .as("Space with name '" + spaceName + "' was not found!")
                .isTrue();
    }

    public void assertThatSpaceIsNotVisible(String spaceName) {
        assertThat(isSpaceWithGivenNameDisplayed(spaceName))
                .as("Space with name '" + spaceName + "' was found but it should be deleted!")
                .isFalse();
    }

    public boolean isSpaceWithGivenNameDisplayed(String spaceName) {
        List<String> allSpaces = CommonMethodsGUI.getTextFromListOfElements(sidebarPage.getListOfSpacesWithNames());
        return allSpaces.contains(spaceName);
    }
}
