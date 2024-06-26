package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.api.utils.BodyUtils;
import com.clickup.commons.Constants;
import com.clickup.commons.Endpoints;
import com.clickup.commons.Temp;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.assertj.core.api.SoftAssertions;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.ConfigurationWhen.paths;
import static net.javacrumbs.jsonunit.core.ConfigurationWhen.then;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_VALUES;

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

        Temp.createdFolderId = SerenityRest.lastResponse().jsonPath().getString("id");
    }

    public static void deleteTestFolder() {
        if (Temp.createdFolderId != null) {
            String id = "/" + Temp.createdFolderId;
            ApiService.runDelete(Endpoints.FOLDER + id);
        }
    }

    public void checkCreatedFolderData() {
        String createdFolderData = getFolderDataByRecentId();
        String expectedFolderData = BodyUtils.getJsonAsString(Constants.EXPECTED_FOLDER);

        assertThatJson(createdFolderData)
                .when(paths("id", "orderindex"), then(IGNORING_VALUES))
                .isEqualTo(expectedFolderData);
    }

    public String getFolderDataByRecentId() {
        String id = "/" + Temp.createdFolderId;
        ApiService.runGet(Endpoints.FOLDER + id);

        Response response = SerenityRest.lastResponse();
        return response.getBody().asString();
    }

}
