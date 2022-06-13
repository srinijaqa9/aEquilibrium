package com.stepDefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.cucumbertest.Driver;
import com.pages.SauceDemo_Pages;
import com.util.ReadPropertiesFileTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceDemo_Login_Test {

	private static final String filename = null;
	SauceDemo_Pages sauceDemo_page = new SauceDemo_Pages();
	ReadPropertiesFileTest readfile = new ReadPropertiesFileTest();
	Properties prop = readfile.readPropertiesFile(filename);

	@Given("^User navigates to the SwagLabs Login UI$")
	public void user_navigates_to_the_SwagLabs_Login_UI() throws Throwable {
		Driver.init(prop.getProperty("Browser"));
		sauceDemo_page.navigateTo_SauceDemoUI();
	}

	@When("^User clicks on the Login button$")
	public void user_clicks_on_the_Login_button() throws Throwable {
		sauceDemo_page.click_login_button();
	}

	@Then("^User should see error message as Epic sadface: Username is required$")
	public void user_should_see_error_message() throws Throwable {
		String error_msg = sauceDemo_page.get_error_message_no_username_no_pwd();
		Assert.assertEquals("Epic sadface: Username is required", error_msg);
	}

	@Then("^User should see error message as Epic sadface: Password is required$")
	public void user_should_see_error_message1() throws Throwable {
		String error_msg = sauceDemo_page.get_error_message_no_pwd();
		Assert.assertEquals("Epic sadface: Password is required", error_msg);
	}

	@When("^the User enters in username field \"(.*?)\" and password field as \"(.*?)\"$")
	public void the_User_enters_in_username_field_and_password_field_as(String arg1, String arg2) throws Throwable {
		sauceDemo_page.enter_username_Valid(arg1);
		sauceDemo_page.enter_password(arg2);
	}
	
	@When("^User enters the user name as \"(.*?)\"$")
	public void user_enters_the_user_name_as1(String arg1) throws Throwable {
		sauceDemo_page.enter_username(arg1);
	}

	@When("^User clears the username field$")
	public void user_clears_the_username_field() throws Throwable {
		sauceDemo_page.clear_username();
	}

	@When("^User waits for the application to load$")
	public void user_waits_for_the_application_to_load() throws Throwable {
		Driver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Given("^User already in the SwagLabs Login UI$")
	public void user_already_in_the_SwagLabs_Login_UI() throws Throwable {
	}
	
	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      final byte[] screenshot = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); 
	    }
	}
}
