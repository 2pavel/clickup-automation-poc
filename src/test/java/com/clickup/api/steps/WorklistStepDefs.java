package com.clickup.api.steps;

import com.clickup.commons.Endpoints;
import com.clickup.api.utils.ApiService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class WorklistStepDefs {

    @When("I send a request to get all workspaces")
    public void i_send_a_request_to_get_all_workspaces() {
        ApiService.runGet(Endpoints.TEAM);
    }

    @And("response body contains all created workspaces and their data")
    public void response_body_contains_all_created_workspaces_and_their_data() {
        // TODO: implement
    }

}
