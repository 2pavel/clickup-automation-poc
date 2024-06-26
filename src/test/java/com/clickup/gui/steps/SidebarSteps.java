package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.gui.TestBase;
import com.clickup.gui.pages.SidebarPage;
import com.clickup.gui.pages.SidebarSpaceCtxPage;
import com.clickup.gui.utils.CommonMethodsGUI;
import com.clickup.gui.utils.Wait;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SidebarSteps extends TestBase {

    SidebarPage sidebarPage;

    SidebarSpaceCtxPage sidebarSpaceCtxPage;

    public void clickCreateSpaceBtn() {
        sidebarPage.clickCreateSpaceBtn();
    }

    public void clickDeleteSpaceBtn(String spaceName) {
        List<WebElementFacade> allSpaces = sidebarPage.getListOfSpacesWithNames();

        Wait.forAllListElementsToBeVisible(allSpaces);

        WebElementFacade spaceRow = CommonMethodsGUI.getElementFromListByText(allSpaces, spaceName);
        CommonMethodsGUI.hoverOverElement(spaceRow);

        String btnLocator = CommonMethodsGUI.buildDataTestLocator("project-row__ellipsis__", spaceName);
        sidebarPage.clickSpaceSettingsBtn(btnLocator);
        sidebarSpaceCtxPage.clickDeleteBtn();
    }

    public void clickDeleteSpaceBtn() {
        String spaceName = Constants.TEST_SPACE;
        List<WebElementFacade> allSpaces = sidebarPage.getListOfSpacesWithNames();

        Wait.forAllListElementsToBeVisible(allSpaces);

        WebElementFacade spaceRow = CommonMethodsGUI.getElementFromListByText(allSpaces, spaceName);
        CommonMethodsGUI.hoverOverElement(spaceRow);

        String btnLocator = CommonMethodsGUI.buildDataTestLocator("project-row__ellipsis__", spaceName);
        sidebarPage.clickSpaceSettingsBtn(btnLocator);
        sidebarSpaceCtxPage.clickDeleteBtn();
    }

    public void assertThatSidebarIsNotCollapsed() {
        assertThat(sidebarPage.getSidebar().getAttribute("data-test").contains("collapsed-container__false"))
                .as("Sidebar is collapsed but it shouldn't!")
                .isTrue();
    }

}
