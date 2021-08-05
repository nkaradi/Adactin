package com.opengoogle.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.Base_Class1;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class OpenGooglestepdef extends Base_Class1 {
	public static WebDriver driver= Runner.driver;
	@Given("^Enter a url$")
	public void enter_a_url() throws Throwable {
		getUrl("https://www.google.com/");
	}

	@When("^Search box click$")
	public void search_box_click() throws Throwable {
	    System.out.println("google");
	}

	@When("^Pass data$")
	public void pass_data() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
	
	}

	@Then("^see the result$")
	public void see_the_result() throws Throwable {
	    //driver.findElement(By.name("q")).sendKeys("svdkjhsfv");
		System.out.println("hgugfg");
	}


}
