package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.api.utils.BodyUtils;
import com.clickup.commons.Constants;
import com.clickup.commons.Endpoints;
import com.clickup.commons.Temp;
import com.clickup.commons.pojo.GoalRequestBody;
import net.serenitybdd.rest.SerenityRest;
import io.restassured.response.Response;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;

public class GoalsSteps {

    public void createGoal(String name) {
        GoalRequestBody goal = new GoalRequestBody();
        goal.setName(name);
        String goalJsonToString = BodyUtils.getBodyFromPojo(goal);

        ApiService.runPostWithJson(Endpoints.WORKSPACE_GOAL, goalJsonToString);

        Temp.createdGoalName = name;
        Temp.createdGoalId = SerenityRest.lastResponse().jsonPath().getString("goal.id");
    }

    public void checkThatGoalIsCreated() {
        String createdGoalData = getGoalDataByRecentId();

        assertThatJson(
                createdGoalData,
                body -> body.inPath("goal.creator").isIntegralNumber().isEqualTo(Constants.USER_ID),
                body -> body.inPath("goal.owners..username").isArray().contains(Constants.USERNAME),
                body -> body.inPath("goal.folder_id").isNull()
        );
    }

    public String getGoalDataByRecentId() {
        String goalId = "/" + Temp.createdGoalId;

        ApiService.runGet(Endpoints.GOAL + goalId);

        Response response = SerenityRest.lastResponse();
        return response.getBody().asString();
    }
}
