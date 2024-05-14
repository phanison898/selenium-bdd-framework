package com.stepDefinitions;

import org.testng.Assert;

import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Phanison
 * @since 15/05/2024
 * @github_username phanison898
 * 
 **/

public class LoginDefinition {

	LoginPage loginPage;

	@Given("login page title is {string}")
	public void login_page_title_is(String title) {

		loginPage = new LoginPage(BackgroundDefinition.getDriver());

		String actualTitle = loginPage.getPageTitle();
		Assert.assertTrue(actualTitle.equals(title), "Title not matched");
		loginPage.logger.pass("Title is displayed as expected", true);
	}

	@When("I entered {string} and {string}")
	public void i_entered_username_and_password(String username, String password) {
		loginPage.enterCredentials(username, password);
	}

	@Then("I should see the home page")
	public void i_should_see_the_home_page() {
		loginPage.logger.pass("Home Page displayed", true);
	}

	@Then("I should not see the home page")
	public void i_should_not_see_the_home_page() {
		loginPage.logger.pass("Home Page displayed", true);
	}

}
