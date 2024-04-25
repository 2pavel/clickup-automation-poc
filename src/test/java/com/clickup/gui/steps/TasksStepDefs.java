package com.clickup.gui.steps;

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
    }
}
