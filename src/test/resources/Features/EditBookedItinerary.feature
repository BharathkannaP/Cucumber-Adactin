Feature: To verify whether the booked itinerary details are not editable.

  Scenario: Verify Booked itinerary and check details
   	Given Launch hotel reservation application
    When Login to the application using username and password 
    And Select location as Sydney
    And Select hotel as hotel creek
		And Select room type as standard
		And Select no-ofrooms as oneday
   	And Enter check-in date as today  
	  And Enter check-out date as today+one date
 		And Select No of-adults as two
 		And Select No of-children as zero 
 		And Click on Search button
 		And Select the hotel and click on continue button
 		Then Fill the form and click on Book now button
 		Then Click on My itinerary button
 		And Verify that the details are not editable
 