package com.adactin.runner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class1;
import com.adactin.property.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
	glue = "com\\adactin\\stepdefinition", monochrome = true, plugin = {"pretty",
			"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport1.html", 
			"html:Report/HTML_Report",
			"json:Report1/CucumberJSON_Report.json"})
public class Runner {
	public static WebDriver driver;
	
   @BeforeClass
	public  static void setup() throws Throwable {
	   String browser = File_Reader_Manager.getInstanceFR().getInstanceCR().getBrowser();
//		driver = Base_Class1.getbrowser("chrome");
	   driver = Base_Class1.getBrowser(browser);
			}
//	@AfterClass
//   public static void quit() {
//	driver = Base_Class1.quit1();
//}
}
