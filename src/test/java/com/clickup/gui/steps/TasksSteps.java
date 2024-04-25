package com.clickup.gui.steps;

import com.clickup.commons.Labels;
import com.clickup.gui.TestBase;
import com.clickup.gui.pages.ControllerRowPage;
import com.clickup.gui.pages.CreateTaskModalPage;
import com.clickup.gui.pages.ProjectMainViewPage;
import com.clickup.gui.utils.CommonMethodsGUI;
import com.clickup.gui.utils.Wait;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TasksSteps extends TestBase {

    ControllerRowPage controllerRowPage;

    CreateTaskModalPage createTaskModalPage;

    ProjectMainViewPage projectMainViewPage;

    public void clickAddTaskBtn() {
        controllerRowPage.clickAddTaskBtn();
    }

    public void enterTaskName() {
        String taskName = Labels.getProp("test_task.name");
        createTaskModalPage.typeIntoTaskNameField(taskName);
    }

    public void clickCreateTaskBtn() {
        createTaskModalPage.clickCreateTaskBtn();
        List<WebElementFacade> allTasks = projectMainViewPage.getMainViewTasksList();
        Wait.forAllListElementsToBeVisible(allTasks);
    }

    public void assertThatTaskIsVisible() {
        String taskName = Labels.getProp("test_task.name");
        assertThat(isTaskWithGivenNameDisplayed(taskName))
                .as("Task with name '" + taskName + "' was not found!")
                .isTrue();
        log().info("Assertion passed");
    }

    public boolean isTaskWithGivenNameDisplayed(String taskName) {
        List<String> allVisibleTasks = CommonMethodsGUI.getTextFromListOfElements(projectMainViewPage.getMainViewTasksList());
        return allVisibleTasks.contains(taskName);
    }
}
