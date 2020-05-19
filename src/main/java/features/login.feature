Feature: FreeCRM Login Functionality




Scenario Outline: CRM Login Functionality

# with Examples keyword
Given User is already on Login Page
When The Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on Login button
Then User is on Home Page
And User closes the browser


Examples:
	| username 		  | password      |
	| batchautomation | Test@12345 	  |
	| tom 			  | Test123@12345 |



