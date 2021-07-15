#Author: chan-ahmad-rajak.shaik@capgemini.com

Feature: Sauce_demo Cart Feature

Scenario: Sauce_demo Cart  Test Scenario

Given customer is already on cart page
When text is displayed as your cart
Then customer clicks on checkout


Scenario: Sauce_demo Cart  Remove Scenario

Given customer is already on cart page
When text is displayed as your cart
Then customer clicks on remove


Given customer is already on cart page
When text is displayed as your cart
Then customer clicks on continue shopping

#Given customer is already on cart page
#When text is displayed as your cart
#Then customer clicks on particular selected product
#Then customer clicks on back to products


#Scenario: Sauce_demo Cart Page Product Scenario

#Given customer is already on cart page
#When Customer clicks on Paticular Product
#Then particularly Selected Product is Displayed
#Then customer clicks on  back to products button for redirecting to home page


#Scenario: Sauce_demo Cart Page Continue Shopping Scenario

#Given Customer is already on Cart page
#When Customer clicks on continue shopping button
#Then Customer redirects to home page
#Then customer clicks on add to cart for desired product
#Then customer clicks on cart page and checkout