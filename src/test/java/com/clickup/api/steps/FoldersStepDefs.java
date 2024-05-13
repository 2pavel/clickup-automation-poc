package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.commons.Endpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FoldersStepDefs {

    @Given("there exists a space")
    public void there_exists_a_space() {
        // TODO
    }

    @When("I send a request to create a folder named {string}")
    public void i_send_a_request_to_create_a_folder_named(String folderName) {
        ApiService.runPostWithJson(Endpoints.CREATE_FOLDER, "{ \"name\": \"" + folderName + "\" }");
    }

    @Then("response body contains newly created folder's data")
    public void response_body_contains_newly_created_folder_s_data() {
        // TODO
    }

}
