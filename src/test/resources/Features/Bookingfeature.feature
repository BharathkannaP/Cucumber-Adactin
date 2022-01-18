Feature: To verify whether the check-out date field accepts a later date than check-in date.

	Scenario: To validate by sending invalid date in check-in and valid check-out date
	Given Launch hotel reservation application 
	When Login to the application using username and password 
	And Select location as Sydney
	And Select hotel as hotel creek
	And Select room type as standard
	And Select no-ofrooms as oneday
  And Enter check-indate later than the check-outdate field as today + seven date and checkout today+five date and click search
  Then Verify that system gives an error saying check-indate should not be later than checkout-date
	
	