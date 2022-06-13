package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumbertest.Driver;

public class SauceDemo_Pages extends Driver {

	@FindBy(xpath = "//*[@id='login-button']")
	WebElement login_button;

	@FindBy(xpath = "//*[@id=\"login-button\"]/../div[3]/h3")
	WebElement error_message_without_uname_Pwd;

	@FindBy(id = "user-name")
	WebElement user_name;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]/../div[3]/h3")
	WebElement error_message_without_Pwd;
	
	@FindBy(xpath = "//input[@placeholder ='Password']")
	WebElement password;
	
	public SauceDemo_Pages() {
		PageFactory.initElements(driver, this);
	}

	public void navigateTo_SauceDemoUI() {
		driver.get("http://www.saucedemo.com");
	}

	public void click_login_button() {
		login_button.click();
	}

	public String get_error_message_no_username_no_pwd() {
		return error_message_without_uname_Pwd.getText();
	}

	public String get_error_message_no_pwd() {
		return error_message_without_Pwd.getText();
	}

	public void enter_username_Valid(String uname) {
		user_name.sendKeys(uname);
	}
	
	public void enter_password(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void enter_username(String uname) {
		user_name.sendKeys(uname);
	}

	public void clear_username() {
		user_name.clear();
	}
}
