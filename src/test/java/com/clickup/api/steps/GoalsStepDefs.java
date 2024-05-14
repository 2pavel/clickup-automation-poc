package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.api.utils.RequestBody;
import com.clickup.commons.Endpoints;
import com.clickup.commons.pojo.GoalRequestBody;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoalsStepDefs {

    @When("I send a request to create a goal named {string}")
    public void i_send_a_request_to_create_a_goal_named(String goalName) {
        GoalRequestBody goal = new GoalRequestBody();
        String goalJsonToString = RequestBody.getBodyFromPojo(goal);
        ApiService.runPostWithJson(Endpoints.GOAL, goalJsonToString);
        // TODO: improve
    }

    @Then("the goal is created")
    public void the_goal_is_created() {
        // TODO:
    }


}
