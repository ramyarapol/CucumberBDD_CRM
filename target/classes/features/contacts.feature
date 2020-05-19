Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given User is already on Login Page
When The Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on Login button
Then User is on Home Page
Then User moves to new contact page
Then User enters contact details "<firstname>" and "<lastname>" and "<position>"
And User closes the browser


Examples:
| username        | password   | firstname | lastname | position|
| batchautomation | Test@12345 | Test      | Run      | Tester  |
| alam            | alamaa     | Alarm     | password | TestingA|
