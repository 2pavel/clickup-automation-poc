package com.clickup.api.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class GoalsStepDefs {

    @Steps
    GoalsSteps goalsSteps;

    @When("I send a request to create a goal named {string}")
    public void i_send_a_request_to_create_a_goal_named(String goalName) {
        goalsSteps.createGoal(goalName);
    }

    @Then("the goal is created")
    public void the_goal_is_created() {
        goalsSteps.checkThatGoalIsCreated();
    }

}
