package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.commons.Constants;
import com.clickup.commons.Endpoints;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.assertj.core.api.SoftAssertions;

public class FoldersSteps {

    public void checkThatTeamSpaceIsAvailable() {
        ApiService.runGetWithParam(Endpoints.TEAM_SPACES, "archived", "false");
        Response response = SerenityRest.lastResponse();

        String responseBody = response.body().toString();

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(responseBody.contains(Constants.TEST_SPACE))
                .as("Team space was not found!")
                .isTrue();

        // TODO: implement json library and update this
    }
}
