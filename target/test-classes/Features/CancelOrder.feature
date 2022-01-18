Feature: To verify that the order gets cancelled after click on Cancel order number link

  Scenario: Cancel order and verify
    Given Launch hotel reservation application
 		And Login to the application using username and password 
	  Then fill the details and book the Hotel and note generated order no 
 		When Click on Booked Itinerary
 	  Then Search for order number booked
 	  When Click on Cancel Order Number
 		Then Click Yes on pop-up which asks where to cancel order or not
 		Then Verify that order number is cancelled and now longer exists in Booked Itinerary page

