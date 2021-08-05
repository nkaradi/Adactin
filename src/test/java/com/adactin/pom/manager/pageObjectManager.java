package com.adactin.pom.manager;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Login_Page;

public class pageObjectManager {
	public static WebDriver driver;

	public pageObjectManager(WebDriver driver2) {
		pageObjectManager.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	private Login_Page lp;

	public Login_Page getInstanceLogin() {
		lp = new Login_Page(driver);
		return lp;
	}
}
