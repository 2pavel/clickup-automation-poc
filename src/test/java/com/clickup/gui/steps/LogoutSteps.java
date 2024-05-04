package com.clickup.gui.steps;

import com.clickup.gui.TestBase;
import com.clickup.gui.pages.UserCtxPage;

public class LogoutSteps extends TestBase {

    UserCtxPage userCtxPage;

    public void clickLogoutBtn() {
        userCtxPage.clickLogoutBtn();
    }
}
