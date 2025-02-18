package testing.testrunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./resources/features", glue="testing/stepdefinitions", plugin = {"pretty", "json:target/cuke-results.json"})
public class TestRunner {

}
