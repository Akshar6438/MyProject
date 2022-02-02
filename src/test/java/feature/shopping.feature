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
@tag
Feature: Ecommerce website feature testing


  Scenario: Clicking on signup button
    Given User must be on homepage by url "https://www.demoblaze.com/"
    When User click on signup button
    Then Signup dialog box should be displayed
    And User must write username
    And User must write Password
    And User must click on signup button 
    And User must click OK on signup successful dialogbox 


  Scenario: Clicking on login button
    Given User must be on homepage by url "https://www.demoblaze.com/"
    When User must click on login button 
    Then Login dialogbox should be displayed
    And User must write valid username
    And User must write valid password
    And User must click on login button
    
    
  Scenario: Clicking on laptop
    Given User must be on homepage by url "https://www.demoblaze.com/prod.html?idp_=15"
    When User must click on laptops
    Then User must click on laptop
    And User must navigate on separate page of laptop by url "https://www.demoblaze.com/prod.html?idp_=15"
    
    
  Scenario: Clicking on Addtocart button
    Given User must be on page by url "https://www.demoblaze.com/prod.html?idp_=15"
    When User must click on Addtocart button 
    Then Product added dialogbox should be displayed
    
    
    
  Scenario: Clicking on cart button
    Given User must be on page by url "https://www.demoblaze.com/prod.html?idp_=15"
    When User must click on cart button
    Then User must be navigate on page by url "https://www.demoblaze.com/cart.html"
    
   
 Scenario: Clicking on placeorder button
    Given User must be on page by url "https://www.demoblaze.com/cart.html"
    When User must click on placeorder button
    Then Place order dialog box should be displayed
  