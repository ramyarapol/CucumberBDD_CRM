Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new deal scenario

Given User is already on Login Page
When The Title of Login Page is Free CRM
Then User enters username and password
| batchautomation | Test@12345 |
Then User clicks on Login button
Then User is on Home Page
Then User moves to new deal page
Then User enters deal details 
| teaam deal | 1000 | 500 | 10 | 
And User closes the browser



Examples:
| username        | password   | firstname | lastname | position|
| batchautomation | Test@12345 | Test      | Run      | Tester  |
| alam            | alamaa     | Alarm     | password | TestingA|