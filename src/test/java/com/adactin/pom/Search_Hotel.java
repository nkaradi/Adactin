package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement Hotels;

	public WebElement getHotels() {
		return Hotels;
	}

	@FindBy(id = "room_type")
	private WebElement Roomtype;

	public WebElement getRoomtype() {
		return Roomtype;
	}

	@FindBy(id = "room_nos")
	private WebElement NoofRooms;
	
	public WebElement getNoofRooms() {
		return NoofRooms;
	}

	@FindBy(id = "datepick_in")
	private WebElement CheckIn;

	public WebElement getCheckIn() {
		return CheckIn;
	}

	@FindBy(id = "datepick_out")
	private WebElement CheckOut;

	public WebElement getCheckOut() {
		return CheckOut;
	}

	@FindBy(id = "adult_room")
	private WebElement AdultsPerRoom;

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	@FindBy(id = "child_room")
	private WebElement ChildsPerRoom;

	public WebElement getChildsPerRoom() {
		return ChildsPerRoom;
	}
	@FindBy(id = "Submit")
	private WebElement Search;
	public WebElement getSearch() {
		return Search;
	}
	

	public Search_Hotel(WebDriver driver2) {
		Search_Hotel.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

}
