package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * 
 * @author Phanison
 * @since 15/05/2024
 * @github_username phanison898
 * 
 **/

@CucumberOptions(features = "src/test/resources/login.feature", glue = { "com.stepDefinitions" }, plugin = { "pretty",
		"html:target/cucumber-reports" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
