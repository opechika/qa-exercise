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
	
Scenario: Number of Project Case
	Given I navigate to Valtech homepage
	When I click on menu icon
	And I click on "Work" link
	Then 15 project cases are displayed  

Scenario Outline: Partner page validation
	Given I navigate to Valtech partner page
	When I click on <Number> logo on the list
	Then "<Partner>" is displayed
	
Examples:
	|Number|Partner|
	|2	   | Adobe |
	|8	   |CommerceTools |

Scenario: Valtech number of offices
	Given I navigate to Valtech contact page
	Then the total number of Valtech offices is displayed