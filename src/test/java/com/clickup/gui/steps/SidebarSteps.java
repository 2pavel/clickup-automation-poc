package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.DeleteSpaceModalPage;
import com.clickup.gui.pages.SidebarPage;
import com.clickup.gui.pages.SidebarSpaceCtxPage;
import com.clickup.gui.utils.CommonMethodsGUI;
import com.clickup.gui.utils.Wait;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SidebarSteps extends TestBase {

    SidebarPage sidebarPage;

    SidebarSpaceCtxPage sidebarSpaceCtxPage;

    DeleteSpaceModalPage deleteSpaceModalPage;

    public void clickCreateSpaceBtn() {
        sidebarPage.clickCreateSpaceBtn();
    }

    public void clickDeleteSpaceBtn(String spaceName) {
        List<WebElementFacade> allSpaces = sidebarPage.getListOfSpacesWithNames();
        Wait.forAllListElementsToBeVisible(allSpaces);

        WebElementFacade spaceRow = CommonMethodsGUI.getElementFromListByText(allSpaces, "TestSpace");
        CommonMethodsGUI.hoverOverElement(spaceRow);

        // TODO: hover worked but some elements were loaded after hover method was called
        //       so ultimately, cursor was in the wrong spot

        String btnLocator = CommonMethodsGUI.buildDataTestLocator("project-row__ellipsis__", "TestSpace");
        sidebarPage.clickSpaceSettingsBtn(btnLocator);

        sidebarSpaceCtxPage.clickDeleteBtn();


    }

}
