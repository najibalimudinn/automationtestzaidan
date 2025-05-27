#Author: Najib Alimudin Fajri
#Updated by: Najib Alimudin Fajri
#Latest Update: 2025-05-25
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Functionality
Feature: Login
  Background:
    Given User has opened the browser
    And User has navigated on the login page Education Fund Payment Management System for Zaidan Educare School app

  @ValidCredentials @TC001
  Scenario Outline: Check login is successful with valid credentials as role "bendahara"
    When User enters "<username>" & "<password>"
    And User clicks on login button
    Then User is navigated to the dashboard page
    And User should be able to see navigation bar for bendahara

    Examples:
      | username  | password  |
      | bendahara | admin123  |

  @InvalidCredentials @TC002
  Scenario Outline: Check login is un-successful with invalid credentials. Its is username not registered
    When User enters "<username>" & "<password>"
    And User clicks on login button
    Then User should be able to see "<un-successful login notification message>"

    Examples:
        | username  | password  | un-successful login notification message  |
        | indra     | admin123  | Username atau password salah              |