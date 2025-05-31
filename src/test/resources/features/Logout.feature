#Author: Alisha Nara Chandrakirana
#Updated by: Alisha Nara Chandrakirana
#Latest Update: 2025-05-27
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

@LogoutFunctionality
Feature: Logout
  Background:
    Given User has opened the browser
    And User has logged in to the Zaidan Educare School app with "bendahara" username and "admin123" password

  @TC003
  Scenario: Check whether logout is successful (session deleted) with "bendahara" credential
    When User clicks the logout button at the top right
    And User clicks the Ya button
    Then User is navigated to the login page
    And User should be able to see login form
