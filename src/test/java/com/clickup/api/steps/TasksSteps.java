package com.clickup.api.steps;

import com.clickup.api.utils.ApiService;
import com.clickup.commons.Endpoints;
import net.serenitybdd.rest.SerenityRest;
import org.assertj.core.api.SoftAssertions;

public class TasksSteps {

    public void checkThatEditableTaskExists() {
        ApiService.runGet(Endpoints.UPDATED_TASK);

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(SerenityRest.lastResponse().statusCode())
                .isEqualTo(200);
    }
}
