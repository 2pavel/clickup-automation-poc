package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import io.cucumber.java.en.Then;

public class CommonStepDefs {

    @Then("I receive a HTTP response code {int}")
    public void i_receive_a_http_response_code(Integer responseCode) {
        ApiService.assertStatusCode(responseCode);
    }

}
