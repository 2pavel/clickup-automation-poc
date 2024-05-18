package com.clickup.api.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class FoldersStepDefs {

    @Steps
    FoldersSteps foldersSteps;

    @Given("there exists a space")
    public void there_exists_a_space() {
        foldersSteps.checkThatTeamSpaceIsAvailable();
    }

    @When("I send a request to create a folder named {string}")
    public void i_send_a_request_to_create_a_folder_named(String folderName) {
        foldersSteps.createFolder(folderName);
    }

    @Then("response body contains newly created folder's data")
    public void response_body_contains_newly_created_folder_s_data() {
        // TODO
    }

}
