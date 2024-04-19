package com.clickup;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.clickup", dryRun = true,
        snippets = CucumberOptions.SnippetType.UNDERSCORE)
public class TestRunner {
}
