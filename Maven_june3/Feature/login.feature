
Feature: DemoWebShop login

Scenario: Test login with valid data

	Given user is on login page
	When user enters valid username as "reqs12@gmail.com" and password as  "abcdef"
	And click on login button
	Then user should lang on homepage