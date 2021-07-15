#Author: your.email@your.domain.com
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

Feature: Sauce_Demo Product Home Page Feature

  
  Scenario: Sauce_Demo Product Home Page Test Scenario
    Given customer is already on home page
    When customer clicks on sort option
    Then customer selects options as required 
    Then required products are sorted
    Then customer clicks on add to cart 
    Then customer clicks on cart icon

  