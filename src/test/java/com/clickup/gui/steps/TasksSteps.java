package com.clickup.gui.steps;

import com.clickup.commons.Constants;
import com.clickup.commons.Labels;
import com.clickup.gui.TestBase;
import com.clickup.gui.pages.*;
import com.clickup.gui.utils.CommonMethodsGUI;
import com.clickup.gui.utils.Wait;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Objects;

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
        String taskName = Labels.getProp("test_task.name");
        createTaskModalPage.typeIntoTaskNameField(taskName);
    }

    public void clickCreateTaskBtn() {
        createTaskModalPage.clickCreateTaskBtn();
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

    public void clickRenameTaskBtn(String taskName) {
        List<WebElementFacade> allTasks = projectMainViewPage.getMainViewTasksList();
        WebElementFacade taskToRename = CommonMethodsGUI.getElementFromListByText(allTasks, taskName);

        CommonMethodsGUI.hoverOverElement(taskToRename);
        String btnLocator = CommonMethodsGUI.buildDataTestLocator(
                "task-row-main__link-text__", taskName) + " [data-test=task-row-main__rename]";
        projectMainViewPage.clickTaskRenameBtn(btnLocator);
        // TODO: remove later
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

    public void saveRenamedTaskLabel(String label) {
        Labels.setProp("test_task.renamed", label);
    }

    public void assertThatTaskIsVisible() {
        String taskName = Labels.getProp("test_task.name");
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
        String taskName = Labels.getProp("test_task.name");
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
