package com.cucumbertest;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},
		 features = "Feature/SauceDemo_SignUp.feature"
		 ,glue={"com.stepDefinition"},monochrome =true,
		 plugin = {"json:target/cucumber.json"})

public class TestRunner {
}