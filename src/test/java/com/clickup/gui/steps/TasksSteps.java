package com.clickup.gui.steps;

import com.clickup.commons.Labels;
import com.clickup.gui.pages.ControllerRowPage;
import com.clickup.gui.pages.CreateTaskModalPage;

public class TasksSteps {

    ControllerRowPage controllerRowPage;

    CreateTaskModalPage createTaskModalPage;

    public void clickAddTaskBtn() {
        controllerRowPage.clickAddTaskBtn();
    }

    public void enterTaskName() {
        String taskName = Labels.getProp("test_task.name");
        createTaskModalPage.typeIntoTaskNameField(taskName);
    }

    public void clickCreateTaskBtn() {
        createTaskModalPage.clickCreateTaskBtn();
    }
}
