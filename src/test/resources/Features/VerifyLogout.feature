Feature: To verify when pressed, logout button logs out from the application.

Scenario:  To validate by details and logout
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
 		And Verify the total price(excl GST) is being calculated as (price-pernight*no-ofrooms*no-ofdays)
 		Then enter the details and click on book now
 		Then check the details, click on logout and verify if we have logged out from the application
 		