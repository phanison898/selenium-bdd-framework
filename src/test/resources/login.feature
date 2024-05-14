#
# @author Phanison
# @since 15/05/2024
# @github_username phanison898
#

@smoke
Feature: Checks Login functionality

	Background:
		Given I launched 'chrome' browser
    When I entered application url 

  Scenario: Check the login functionality using valid credentials
    Given login page title is '<title>'
    When I entered '<username>' and '<password>'
    Then I should see the home page
    
    Examples: 
      | username  		| password  	 | title  		|
      | standard_user | secret_sauce | Swag Labs 	|


  Scenario: Check the login functionality using invalid credentials
    Given login page title is '<title>'
    When I entered '<username>' and '<password>'
    Then I should see the home page
    
    Examples: 
      | username  		| password  	 | title  		|
      | user | pass | Swag Labs 	|
