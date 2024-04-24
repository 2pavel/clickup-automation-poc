package com.clickup.gui.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class TasksStepDefs {

    @Steps
    TasksSteps tasksSteps;

    @When("I click Add Task button")
    public void i_click_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I complete task creation form")
    public void i_complete_task_creation_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The task is visible on the list")
    public void the_task_is_visible_on_the_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
