Feature: SauceDemo Login Functionality 

Scenario: Login Functionality Negative test case with user name and password not provided
Given User navigates to the SwagLabs Login UI
When User waits for the application to load
And User clicks on the Login button
Then User should see error message as Epic sadface: Username is required

Scenario: Login Functionality test case with user name as special characters
Given User already in the SwagLabs Login UI
When User enters the user name as "#@%\\*&$"
And User clicks on the Login button
Then User should see error message as Epic sadface: Password is required

Scenario: Login Functionality test case with user name as numericals
Given User already in the SwagLabs Login UI
When User clears the username field
And User enters the user name as "onetwothreefour"
And User clicks on the Login button
Then User should see error message as Epic sadface: Password is required

Scenario: Login Functionality test case with user name as combination of special chars and numericals
Given User already in the SwagLabs Login UI
When User clears the username field
And User enters the user name as "#@onetwothreefour"
And User clicks on the Login button
Then User should see error message as Epic sadface: Password is required

Scenario Outline: Login Functionality test case with valid user name valid password
Given User already in the SwagLabs Login UI
When User clears the username field
When the User enters in username field "<username>" and password field as "password"
And User clicks on the Login button

Examples: 
  | username       					| password     | 
  | standard_user 					| secret_sauce |
  | locked_out_user 				| secret_sauce |
  | problem_user 						| secret_sauce |
  | performance_glitch_user | secret_sauce |