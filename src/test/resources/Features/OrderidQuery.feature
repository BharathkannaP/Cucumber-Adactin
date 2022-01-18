Feature: To check whether search order id” query is working and displaying the relevant details
  
  	Scenario: To check search functionality enter order query and verify the details
    Given Launch hotel reservation application
 		And Login to the application using username and password 
	  Then Click on Booked Itinerary
	  And Enter the order id.
	  Then Verify that the relevant details are displayed