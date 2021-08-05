package com.opengoogle.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.adactin.baseclass.Base_Class1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\opengoogle\\features", glue = "com\\opengoogle\\stepdefinition")
public class GoogleRunner {
public static WebDriver driver;
@BeforeClass
	public static void setup() {
		driver= Base_Class1.getBrowser("chrome");
	
	}
}
