$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "User want to book the Hotel Room",
  "description": "",
  "id": "user-want-to-book-the-hotel-room",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User want to Login the adactin application",
  "description": "",
  "id": "user-want-to-book-the-hotel-room;user-want-to-login-the-adactin-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the \"ShallowDurga\" username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the \"74108520\" password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User valid the username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 2699850188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ShallowDurga",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_username(String)"
});
formatter.result({
  "duration": 87849818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "74108520",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_password(String)"
});
formatter.result({
  "duration": 74613627,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_valid_the_username_and_password()"
});
formatter.result({
  "duration": 825183005,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User want to search hotel",
  "description": "",
  "id": "user-want-to-book-the-hotel-room;user-want-to-search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user select location",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user select the hotels",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user select the roomtype",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User select no of rooms",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User select checkInDate",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User select checkOutDate",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User select no of adults",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user select child per room",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User want to search",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_select_location()"
});
formatter.result({
  "duration": 123961272,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_hotels()"
});
formatter.result({
  "duration": 100833159,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_roomtype()"
});
formatter.result({
  "duration": 88763560,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_no_of_rooms()"
});
formatter.result({
  "duration": 86751026,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_checkInDate()"
});
formatter.result({
  "duration": 103456201,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_checkOutDate()"
});
formatter.result({
  "duration": 96086555,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_no_of_adults()"
});
formatter.result({
  "duration": 53156250,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_child_per_room()"
});
formatter.result({
  "duration": 53045531,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_want_to_search()"
});
formatter.result({
  "duration": 566657264,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User want to select Hotel",
  "description": "",
  "id": "user-want-to-book-the-hotel-room;user-want-to-select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user select Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User submit",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_select_Hotel()"
});
formatter.result({
  "duration": 66974025,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_submit()"
});
formatter.result({
  "duration": 561619867,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User book a hotel",
  "description": "",
  "id": "user-want-to-book-the-hotel-room;user-book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user enter a firstname",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user enter a lastname",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user enter a billing address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user enter a credit card num",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user choose a credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user choose a credit card month",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user enter card year",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user enter card cvv",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user select the booknow",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_enter_a_firstname()"
});
formatter.result({
  "duration": 73662875,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_a_lastname()"
});
formatter.result({
  "duration": 61248368,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_a_billing_address()"
});
formatter.result({
  "duration": 77420785,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_a_credit_card_num()"
});
formatter.result({
  "duration": 118020707,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_choose_a_credit_card_type()"
});
formatter.result({
  "duration": 144918238,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_choose_a_credit_card_month()"
});
formatter.result({
  "duration": 121639908,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_card_year()"
});
formatter.result({
  "duration": 83683555,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_card_cvv()"
});
formatter.result({
  "duration": 56543749,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_booknow()"
});
formatter.result({
  "duration": 51282737,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User checking Booking confirmation",
  "description": "",
  "id": "user-want-to-book-the-hotel-room;user-checking-booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "user select exit",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_select_exit()"
});
formatter.result({
  "duration": 529170843,
  "status": "passed"
});
});