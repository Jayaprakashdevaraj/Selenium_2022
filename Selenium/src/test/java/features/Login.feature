Feature: Login to the leaftab application
Background:
Given Launch the Chrome Browser
And Load the URL and Maximized

Scenario: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click the login button
Then Verify the HomePage is displayed


Scenario: Negative Login
Given Type the username as 'Demo'
And Type the password as 'crmsfa'
When Click the login button
But Error message is displayed