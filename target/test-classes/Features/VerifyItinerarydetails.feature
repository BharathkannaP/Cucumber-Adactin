Feature: Verify all the details of newly generated order number in booked itinerary page are correct and match with data during booking

  Scenario: To check Itinerary details and order number
    Given Launch hotel reservation application
 		And Login to the application using username and password 
	  Then fill the details and book the Hotel and note generated order no 
 		When Click on Booked Itinerary
 	  Then Search for order number booked
 	  Then Verify all the details of order number are correct as entered during saving order

