Feature: To check Hotel name, Location, room type, Total Day, price per
  
  Scenario: Data should be same as selected in previous screen
  
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
 		Then Verify that total-price is being calculated as (price-pernight*no-ofrooms*no-of-days)