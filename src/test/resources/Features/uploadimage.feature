Feature: features to test login functionality

 Scenario: check upload image is successful
 	Given the browser is open 
 	And the user is on login page
 	When the user enters username and password
 	And the user clicks on login button
 	Then the user is navigated to the postfeed page
 	##When the user clicks top right button
 	##Then the user is navigated to expanded drop
 	When the user clicks Hello Ahsoka Tano
 	And the user clicks profile
 	Then the user is navigated to editprofile
 	When the user clicks on pencil icon
 	And the user clicks on update image
 	
 	