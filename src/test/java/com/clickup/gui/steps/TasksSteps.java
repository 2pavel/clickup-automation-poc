package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.commons.Labels;
import com.clickup.commons.Temp;
import com.clickup.gui.TestBase;
import com.clickup.gui.pages.*;
import com.clickup.gui.utils.CommonMethodsGUI;
import com.clickup.gui.utils.Wait;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TasksSteps extends TestBase {

    ControllerRowPage controllerRowPage;

    CreateTaskModalPage createTaskModalPage;

    TaskViewModalPage taskViewModalPage;

    ProjectMainViewPage projectMainViewPage;

    TaskCtxPage taskCtxPage;

    ToastPage toastPage;

    public void clickAddTaskBtn() {
        controllerRowPage.clickAddTaskBtn();
    }

    public void enterTaskName() {
        String taskName = Constants.TEST_TASK;
        createTaskModalPage.typeIntoTaskNameField(taskName);
    }

    public void clickCreateTaskBtn() {
        createTaskModalPage.clickCreateTaskBtn();
        toastPage.getGeneralToastTitle().waitUntilVisible();
        List<WebElementFacade> allTasks = projectMainViewPage.getMainViewTasksList();
        Wait.forAllListElementsToBeVisible(allTasks);
    }

    public void openTaskContextMenu(String taskName) {
        String containerLocator = CommonMethodsGUI.buildDataTestLocator("task-row__container__", taskName);
        String btnLocator = containerLocator + " " + Constants.TASK_CTX_DATA_TEST;
        projectMainViewPage.clickTaskCtxBtn(btnLocator);
    }

    public void clickDeleteTaskBtn() {
        taskCtxPage.clickDeleteBtn();
    }

    public void clickOnTheTaskRow(String taskName) {
        projectMainViewPage.clickTaskByName(taskName);
        WebElementFacade taskViewContainer = taskViewModalPage.getTaskViewContainer();
        taskViewContainer.waitUntilVisible();
    }

    public void typeIntoTaskNameField(String newTaskName) {
        taskViewModalPage.typeIntoTaskNameField(newTaskName);
        saveRenamedTaskLabel(newTaskName);
    }

    public void confirmTaskNameAndClose() {
        CommonMethodsGUI.pressEnter();
        taskViewModalPage.close();
    }

    public void renameLastTaskIfNotVisible(String taskName) {
        if (!isTaskWithGivenNameDisplayed(taskName)) {
            List<WebElementFacade> taskList = projectMainViewPage.getMainViewTasksList();
            WebElementFacade lastTask = taskList.get(taskList.size() - 1);
            lastTask.click();
            typeIntoTaskNameField(taskName);
            confirmTaskNameAndClose();
        }
    }

    public void saveRenamedTaskLabel(String tempLabel) {
        Temp.renamedTask = tempLabel;
    }

    // ------------ ASSERTIONS ------------
    public void assertThatTaskIsVisible() {
        String taskName = Constants.TEST_TASK;
        assertThat(isTaskWithGivenNameDisplayed(taskName))
                .as("Task with name '" + taskName + "' was not found!")
                .isTrue();
    }

    public void assertThatTaskIsVisible(String taskName) {
        assertThat(isTaskWithGivenNameDisplayed(taskName))
                .as("Task with name '" + taskName + "' was not found!")
                .isTrue();
    }

    public void assertThatTaskIsNotVisible() {
        String taskName = Constants.TEST_TASK;
        assertThat(isTaskWithGivenNameDisplayed(taskName))
                .as("Task with name '" + taskName + "' was found but it should no longer be visible!")
                .isFalse();
    }

    public void assertThatTaskRemovalToastIsVisible() {
        assertThat(toastPage.getTaskRemovedToast().isDisplayed())
                .as("Toast notification was not displayed!")
                .isTrue();
    }

    public boolean isTaskWithGivenNameDisplayed(String taskName) {
        List<WebElementFacade> taskRows = projectMainViewPage.getMainViewTasksList();
        List<String> taskLabels = CommonMethodsGUI.getTextFromListOfElements(taskRows);
        return taskLabels.contains(taskName);
    }
}
