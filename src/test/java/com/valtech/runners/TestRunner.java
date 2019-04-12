package com.valtech.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/valtech/features",
		glue = {"com/valtech/hooks", "com/valtech/stepDefinition"},
		tags = {"~@RegressionTest"}
		
		)
public class TestRunner {

}
