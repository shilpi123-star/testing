package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/bbc.feature"},glue = {"api.cucumber.steps"},plugin = {"pretty","html:target/cucumber-report.html"},monochrome = true,dryRun = true)
public class TestRunner {

}
