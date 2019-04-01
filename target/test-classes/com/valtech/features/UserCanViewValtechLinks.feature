Feature: Links
	As a customer
	I want the ability to view Valtech area of work
	So that I can know how to get involve with Valtech
	
	
Scenario: User can view links
	Given I navigate to Valtech homepage
	When I click on menu icon
	Then the menu dropdown contains "Work"
	And the menu dropdown contains "Public Sector"
	And the menu dropdown contains "Services"
	And the menu dropdown contains "Career"
	And the menu dropdown contains "Insights"
	
	