package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Aryan.Pandey\\IdeaProjects\\CucumberWithSelenium\\src\\test\\resources\\guru99.feature", glue={"StepDefinitions"},
plugin = {"pretty", "html:target/Report/report1.html"})


public class Runner {
}
