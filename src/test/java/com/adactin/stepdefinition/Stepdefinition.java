package com.adactin.stepdefinition;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.Base_Class1;
import com.adactin.pom.Book_Hotel;
import com.adactin.pom.Booking_Confirmation;

import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;
import com.adactin.pom.manager.pageObjectManager;
import com.adactin.property.File_Reader_Manager;
import com.adactin.runner.Runner;
import cucumber.api.java.en.*;

public class Stepdefinition extends Base_Class1 {
	
	public static WebDriver driver = Runner.driver;
	
//	Login_Page lp = new Login_Page(driver);
	
	pageObjectManager dv = new pageObjectManager(driver);
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	String url = File_Reader_Manager.getInstanceFR().getInstanceCR().getUrl();
//	getUrl("https://adactinhotelapp.com/");
	getUrl(url);
	
	}

//	@When("^User enter the valid username$")
//	public void user_enter_the_valid_username() throws Throwable {
//	sendkeys(dv.getInstanceLogin().getUsername(),"ShallowDurga");
//	}
//
//	@When("^User enter the valid password$")
//	public void user_enter_the_valid_password() throws Throwable {
//		sendkeys(dv.getInstanceLogin().getPassword(), "741018520");
//	}
	
	@When("^User enter the \"([^\"]*)\" username$")
	public void user_enter_the_username(String arg1) throws Throwable {
	 sendkeys(dv.getInstanceLogin().getUsername(), arg1);  
	}

	@When("^User enter the \"([^\"]*)\" password$")
	public void user_enter_the_password(String arg1) throws Throwable {
	   sendkeys(dv.getInstanceLogin().getPassword(), arg1);
	}



	@Then("^User valid the username and password$")
	public void user_valid_the_username_and_password() throws Throwable {
		Checkbox(dv.getInstanceLogin().getLogin());
	  
	}
	
	//Search Hotel
	
	
	Search_Hotel sh = new Search_Hotel(driver);
	
	@When("^user select location$")
	public void user_select_location() throws Throwable {
		dropDown(sh.getLocation(),"byValue", "London");
	}
	
	@When("^user select the hotels$")
	public void user_select_the_hotels() throws Throwable {
		dropDown(sh.getHotels(), "byValue", "Hotel Hervey");  
	}
	@When("^user select the roomtype$")
	public void user_select_the_roomtype() throws Throwable {
		dropDown(sh.getRoomtype(), "byValue", "Super Deluxe");
	    
	}

	@When("^User select no of rooms$")
	public void user_select_no_of_rooms() throws Throwable {
		dropDown(sh.getNoofRooms(), "byValue", "2");  
	}
	@When("^User select checkInDate$")
	public void user_select_checkInDate() throws Throwable {
		elementClear(sh.getCheckIn());
		sendkeys(sh.getCheckIn(), "08/08/2021");    
	}

	@When("^User select checkOutDate$")
	public void user_select_checkOutDate() throws Throwable {
		elementClear(sh.getCheckOut());
		sendkeys(sh.getCheckOut(), "09/08/2021");
	    
	}

	@When("^User select no of adults$")
	public void user_select_no_of_adults() throws Throwable {
		sendkeys(sh.getAdultsPerRoom(), "2");
	   
	}
	@When("^user select child per room$")
	public void user_select_child_per_room() throws Throwable {
		sendkeys(sh.getChildsPerRoom(), "2");
	 }

	@Then("^User want to search$")
	public void user_want_to_search() throws Throwable {
		click(sh.getSearch());
	    
	}
	
	//Search Hotel
	Select_Hotel s1 = new Select_Hotel(driver);
	
	@When("^user select Hotel$")
	public void user_select_Hotel() throws Throwable {
	    click(s1.getselection());
	}
	@Then("^User submit$")
	public void user_submit() throws Throwable {
		click(s1.getContinue());
	   
	}
	
	//Book a Hotel
	
	Book_Hotel bh = new Book_Hotel(driver);
	
	@When("^user enter a firstname$")
	public void user_enter_a_firstname() throws Throwable {
		sendkeys(bh.getfirstname(), "Shallow");
	   
	}

	@When("^user enter a lastname$")
	public void user_enter_a_lastname() throws Throwable {
		sendkeys(bh.getlastname(), "Mailo");
	    
	}

	@When("^user enter a billing address$")
	public void user_enter_a_billing_address() throws Throwable {
		sendkeys(bh.getbillingaddress(), "124,2 kilpauk, France ");
	  
	}
	@When("^user enter a credit card num$")
	public void user_enter_a_credit_card_num() throws Throwable {
		sendkeys(bh.getcreditcardnum()," 3578951245613562");
	}

	@When("^user choose a credit card type$")
	public void user_choose_a_credit_card_type() throws Throwable {
		dropDown(bh.getCardType(), "byValue","VISA");
	  
	}
	@When("^user choose a credit card month$")
	public void user_choose_a_credit_card_month() throws Throwable {
		dropDown(bh.getExpiryMon(), "byValue", "8");
	}
	

	@When("^user enter card year$")
	public void user_enter_card_year() throws Throwable {
		dropDown(bh.getExpiryyear(),"byValue","2021");
	   
	}

	@When("^user enter card cvv$")
	public void user_enter_card_cvv() throws Throwable {
//	String cvv = File_Reader_Manager.getInstanceFR().getInstanceCR().getcvv();
		sendkeys(bh.getCvv(), "789");
	//	sendkeys(bh.getCvv(), cvv);
	}

	@Then("^user select the booknow$")
	public void user_select_the_booknow() throws Throwable {
		click(bh.getBook());
	}

	
	
Booking_Confirmation bc = new Booking_Confirmation(driver);
	@When("^user select exit$")
	public void user_select_exit() throws Throwable {
		click(bc.getExit());
	}
	
	
}
	
	



