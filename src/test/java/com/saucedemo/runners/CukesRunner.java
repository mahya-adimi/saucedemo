package com.saucedemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json",
                "html:target/html-reports.html"
        },
        features = "src/test/resources/Features",
        glue = "com/saucedemo/step_definitions",
        dryRun = false,
        tags = "@regression"
)

public class CukesRunner {

}
