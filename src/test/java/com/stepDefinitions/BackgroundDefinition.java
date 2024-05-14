package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.base.BrowserType;
import com.base.Chrome;
import com.base.Driver;
import com.base.Edge;
import com.base.Firefox;
import com.config.Config;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/**
 * 
 * @author Phanison
 * @since 15/05/2024
 * @github_username phanison898
 * 
 **/

public class BackgroundDefinition {

	public static ThreadLocal<WebDriver> localDriver = new ThreadLocal<WebDriver>();

	@Given("I launched {string} browser")
	public void i_launched_a_browser(String browser) {

		Config.setBrowserName(browser);

		Driver driver = null;

		switch (browser.toLowerCase()) {
		case BrowserType.CHROME:
			driver = new Chrome();
			break;
		case BrowserType.FIREFOX:
			driver = new Firefox();
			break;
		case BrowserType.EDGE:
			driver = new Edge();
			break;
		default:
			driver = new Chrome();
			break;
		}

		driver.init();

		driver.onboarding();

		localDriver.set(driver.get());
	}

	@When("I entered application url")
	public void i_entered_application_url() {
		getDriver().get(Config.getTestApplicationURL());
	}

	public static WebDriver getDriver() {
		return localDriver.get();
	}

}
