@smoke
Feature: DemoWebShop Login

Scenario: Test login with valid data & valid password
Given User is on login page
When user enter valid username as "<username>" and password  as "<password>"
Then user redirected to homepage

Examples: 

|username|password|
|reqs12@gmail.com|abcdef|
|pqrs13@gmail.com|abcdef|