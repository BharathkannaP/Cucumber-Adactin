Feature:  To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
  
  Scenario:  To validate by select Room Type and verify
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
 		Then verify that room type reflected is the same as selected in search hotel page