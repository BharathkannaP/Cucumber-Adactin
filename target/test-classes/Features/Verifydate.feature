
Feature:  To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
  
  Scenario:  To validate by enter no.of rooms and verify
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
 		Then Click on Search button
 		Then Verify that check-in-date and check-out-dates are the same as selected in search hotel form