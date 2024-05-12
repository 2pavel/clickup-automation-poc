package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.commons.Constants;
import com.clickup.commons.Endpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TasksStepDefs {

    @Given("a task that can be edited exists")
    public void a_task_that_can_be_edited_exists() {
        // TODO:
    }
    @When("I send a request to update the task")
    public void i_send_a_request_to_update_the_task() {
        ApiService.runPutWithJson(Endpoints.TASK + "/" + Constants.UPDATED_TASK_ID, "{ \"description\": \"Updated via cucumber\" }");
    }
    @Then("response contains updated task description")
    public void response_contains_updated_task_description() {
        // TODO:
    }

}
