package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.api.utils.BodyUtils;
import com.clickup.commons.Endpoints;
import com.clickup.commons.Temp;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.assertj.core.api.SoftAssertions;

import static org.assertj.core.api.Assertions.assertThat;

public class TasksSteps {

    public void checkThatEditableTaskExists() {
        ApiService.runGet(Endpoints.UPDATED_TASK);

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(SerenityRest.lastResponse().statusCode())
                .isEqualTo(200);
    }

    public void updateTask() {
        String randomDescription = BodyUtils.getRandomDescriptionBody();
        ApiService.runPutWithJson(Endpoints.UPDATED_TASK, randomDescription);
    }

    public void assertThatTaskWasUpdated() {
        ApiService.runGet(Endpoints.UPDATED_TASK);
        Response response = SerenityRest.lastResponse();
        String receivedDescription = response.jsonPath().getString("description");

        assertThat(Temp.updatedTaskDescription)
                .as("Task description did not match recently sent request")
                .isEqualTo(receivedDescription);
    }
}
