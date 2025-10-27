package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/featureFile",      // Path to feature files
    glue = "stepDefinitions",                         // Step definition package
    plugin = {
        "pretty",                                     // Console output
        "html:target/cucumber-reports-SimpleLoginone.html", // HTML report
        "json:target/cucumber-SimpleLoginone.json"    // JSON report
    },
    monochrome = true,                                // Clean console output
    tags = "@SimpleLoginone"                          // Tag to execute
)
public class AddEmp {
    // Runner class — no methods needed
}
