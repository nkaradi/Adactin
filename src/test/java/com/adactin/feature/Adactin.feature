Feature: User want to book the Hotel Room 

Scenario: User want to Login the adactin application 
	Given User launch the application 
	When User enter the "ShallowDurga" username 
	And  User enter the "74108520" password 
	Then User valid the username and password 
	
Scenario: User want to search hotel 
	When user select location 
	When user select the hotels 
	When user select the roomtype 
	When User select no of rooms 
	When User select checkInDate 
	When User select checkOutDate 
	And User select no of adults 
	And user select child per room 
	Then User want to search 
	
Scenario: User want to select Hotel 
	When user select Hotel 
	Then User submit 
	
	
Scenario: User book a hotel 
	When user enter a firstname 
	And user enter a lastname 
	And user enter a billing address 
	And user enter a credit card num 
	And user choose a credit card type 
	And user choose a credit card month
	And user enter card year 
	And user enter card cvv 
	Then user select the booknow 
	
Scenario: User checking Booking confirmation
    When user select exit
	
