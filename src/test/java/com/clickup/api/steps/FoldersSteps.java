package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.api.utils.BodyUtils;
import com.clickup.commons.Constants;
import com.clickup.commons.Endpoints;
import com.clickup.commons.Temp;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.assertj.core.api.SoftAssertions;

public class FoldersSteps {

    public void checkThatTeamSpaceIsAvailable() {
        ApiService.runGetWithParam(Endpoints.TEAM_SPACES, "archived", "false");

        Response response = SerenityRest.lastResponse();
        String availableSpaces = response.jsonPath().getString("spaces.name");

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(availableSpaces.contains(Constants.TEAM_SPACE))
                .as("Team space was not found!")
                .isTrue();
    }

    public void createFolder(String folderName) {
        Temp.createdFolderName = folderName;
        String body = BodyUtils.getSingleFieldBody("name", folderName);

        ApiService.runPostWithJson(Endpoints.CREATE_FOLDER, body);

        Response response = SerenityRest.lastResponse();
        Temp.createdFolderId = response.jsonPath().getString("id");
    }

    public void assertThatFolderDataIsCorrect() {

    }
}
