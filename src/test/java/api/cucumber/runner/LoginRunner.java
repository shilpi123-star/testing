package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/posts.feature"},glue = {"api.cucumber.steps","api.cucumber.hooks"},dryRun = false)
public class LoginRunner {
}
