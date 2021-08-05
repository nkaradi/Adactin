Feature: open google

Scenario: search a term in google
	Given Enter a url
	When Search box click
	And Pass data
	Then see the result