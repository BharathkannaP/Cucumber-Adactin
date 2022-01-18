Feature: To check correct total price is Being Calculated as “price per night*no of days*no of rooms in Book a hotel Page

Scenario:  To validate by enter details and verify price calculation
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
 		Then Verify that total-price is being calculated as (price-per-night*no-of rooms*no-of days)
 			