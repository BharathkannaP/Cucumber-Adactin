Feature: To validate the login functionality of Adactinhotel application

	Scenario: To validate with valid username and  password

	Given User should be in the Adactinhotel login page
	When User pass the value to the username field
	And User pass the value to password field
	And User clicks the login button
	Then User should be in Search hotel page
	Then Close the browser
	
	
#	Scenario Outline: To validate the positive and negative combinations
#
#	Given To Launch the browser and hit the url
#	When To pass the data in "<username>"username txtbox
#	And To pass the data in "<password>"password field
#	And To clicks the login button
#	Then User should be in Search hotel page
#	Then Close the browser
	

#	Examples:
#	|username|password|
#	|barathkanna|12345678|
#	|kksaamm|12365478|
#	|lkghhg|khjhggh|