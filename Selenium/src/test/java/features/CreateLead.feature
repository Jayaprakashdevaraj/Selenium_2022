Feature: Login to the leaftab application
Background: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click the login button
Then Verify the HomePage is displayed

Scenario Outline: Create lead with different data
Given Click CRMSFA link
And click Lead tab
And Click createlead link
When Type company name as <companyName>
And Type firstname as <firstName>
And Type lastname as <lastName>
And click the Create Lead Button
Then verify the view leads page

Examples:
|companyName|firstName|lastNam|
|Infosys|Jayaprakash|Devaraj|
|Apple|Jaya|Prakash|
