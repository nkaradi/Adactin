package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;

		@FindBy(id ="radiobutton_0")
		private WebElement selection;
		public WebElement getselection() {
			return selection;
			
		}
		@FindBy(id ="continue")
		private WebElement Continue;
		public WebElement getContinue() {
		return Continue;
		}
		
		
		public Select_Hotel(WebDriver driver2) {
			Select_Hotel.driver = driver2;
			PageFactory.initElements(driver2, this);
		}
	}
	


