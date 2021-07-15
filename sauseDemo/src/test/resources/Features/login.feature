#Author: chan-ahmad-rajak.shaik@capgemini.com

Feature: Sauce Demo login page Feature


Scenario: Sauce Demo login Test Scenario

Given customer is already on login  page
When title of login page is Sauce demo
Then customer enters username and password
| username | password |
| standard_user | secret_sauce |


Then customer clicks on login button
 
Then customer is on home page 