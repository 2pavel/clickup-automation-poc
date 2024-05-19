package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.api.utils.BodyUtils;
import com.clickup.commons.Constants;
import com.clickup.commons.Endpoints;
import net.serenitybdd.rest.SerenityRest;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;

public class WorklistSteps {

    public void getAllWorkspaces() {
        ApiService.runGetWithParam(Endpoints.TEAM_SPACES, "archived", "false");
    }

    public void checkWorkspacesData() {
        String receivedWorkspaceData = SerenityRest.lastResponse().body().asString();
        String expectedWorkspaceData = BodyUtils.getJsonAsString(Constants.EXPECTED_WORKSPACES);

        assertThatJson(receivedWorkspaceData)
                .isEqualTo(expectedWorkspaceData);
    }

}
