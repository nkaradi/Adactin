package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public static WebDriver driver; 
	

	@FindBy(id = "first_name")
	private WebElement Firstname;
	public WebElement getfirstname() {
		return Firstname;
		}
	
	@FindBy(id = "last_name")
	private WebElement Lastname;
	public WebElement getlastname() {
		return Lastname;
	}
	@FindBy(id = "address")
	private WebElement BillingAddress;
	public WebElement getbillingaddress() {
		return BillingAddress;
	}
	@FindBy(id = "cc_num")
	private WebElement CreditCardNum;
	public WebElement getcreditcardnum() {
		return CreditCardNum;
	}
	
	@FindBy(id = "cc_type")
	private WebElement cardType;
	public WebElement getCardType() {
		return cardType;
	}
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMon;
	public WebElement getExpiryMon() {
		return expiryMon;
	}
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(id = "book_now")
	private WebElement book;
	public WebElement getBook() {
		return book;
	}
	

	public Book_Hotel(WebDriver driver2) {
	Book_Hotel.driver = driver2;
		PageFactory.initElements(driver2, this);
		}


	
}


	

	


