package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/Login.feature",
        glue= "stepDefinitions",
        publish = true,
        dryRun = false,
        monochrome = true,
        plugin= {"pretty", "html:test-output"

        }
)
public class TestRunner {
}
