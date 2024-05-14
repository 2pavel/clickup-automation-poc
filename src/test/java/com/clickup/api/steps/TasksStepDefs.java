package com.clickup.api.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class TasksStepDefs {

    @Steps
    TasksSteps tasksSteps;

    @Given("a task that can be edited exists")
    public void a_task_that_can_be_edited_exists() {
        tasksSteps.checkThatEditableTaskExists();
    }
    @When("I send a request to update the task")
    public void i_send_a_request_to_update_the_task() {
        tasksSteps.updateTask();
    }
    @Then("response contains updated task description")
    public void response_contains_updated_task_description() {
        tasksSteps.assertThatTaskWasUpdated();
    }

}
