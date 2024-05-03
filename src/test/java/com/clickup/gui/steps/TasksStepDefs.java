package com.clickup.gui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class TasksStepDefs {

    @Steps
    TasksSteps tasksSteps;

    @When("I click Add Task button")
    public void i_click_add_task_button() {
        tasksSteps.clickAddTaskBtn();
    }
    @When("I complete task creation form")
    public void i_complete_task_creation_form() {
        tasksSteps.enterTaskName();
        tasksSteps.clickCreateTaskBtn();
    }
    @Then("The task is visible on the list")
    public void the_task_is_visible_on_the_list() {
        tasksSteps.assertThatTaskIsVisible();
        // TODO: sometimes assert is checked too quickly; before task appears
    }

    @Given("I am on a project page with created task {string}")
    public void i_am_on_a_project_page_with_created_task(String taskName) {
        // TODO: implement
    }
    @When("I click delete in the {string} context menu")
    public void i_click_delete_in_the_task_context_menu(String taskName) {
        tasksSteps.openTaskContextMenu(taskName);
        tasksSteps.clickDeleteTaskBtn();
    }
    @Then("The task is removed")
    public void the_task_is_removed() {
        tasksSteps.assertThatTaskIsNotVisible();
    }
    @Then("Toast notification informing about removed task appears")
    public void toast_notification_informing_about_removed_task_appears() {
        tasksSteps.assertThatTaskRemovalToastIsVisible();
    }

    @When("I click on the {string} row")
    public void i_click_on_the_row(String taskName) {
        tasksSteps.clickOnTheTaskRow(taskName);
    }
    @When("I type {string} into the row input field")
    public void i_type_into_the_row_input_field(String newTaskName) {
        tasksSteps.typeIntoTaskNameField(newTaskName);

    }
    @Then("The task name is changed")
    public void the_task_name_is_changed() {
        // TODO: implement
    }

}
