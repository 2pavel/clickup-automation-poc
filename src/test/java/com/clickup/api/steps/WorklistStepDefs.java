package com.clickup.api.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class WorklistStepDefs {

    @Steps
    WorklistSteps worklistSteps;

    @When("I send a request to get all workspaces")
    public void i_send_a_request_to_get_all_workspaces() {
        worklistSteps.getAllWorkspaces();
    }

    @And("response body contains all created workspaces and their data")
    public void response_body_contains_all_created_workspaces_and_their_data() {
        worklistSteps.checkWorkspacesData();
    }

}
