package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	public static WebDriver driver;
	
	@FindBy(linkText="Logout")
	private WebElement exit;
		public WebElement getExit() {
		return exit;
	}
		
		public Booking_Confirmation(WebDriver driver2) {
			Booking_Confirmation.driver=driver2;
			PageFactory.initElements(driver2, this);
			}


}
