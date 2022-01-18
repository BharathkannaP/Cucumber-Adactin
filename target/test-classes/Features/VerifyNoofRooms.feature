Feature:  To verify date and Check Out date are being displayed in Select Hotel Page according to the dates selected in search Hotel.
  
  Scenario:  To validate by select location and verify
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
 		Then Verify that no. of rooms reflected according to the no. of rooms selected in search hotel page