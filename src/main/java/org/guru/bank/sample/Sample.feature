#Author: your.email@your.domain.com
@tag
Feature: To test the Login feature

  @tag1
  Scenario: Verify the login with valid credentials
    Given The user is in the Guru login Page
    When The user enters the valid credentials
    And The user clicks the login button
    Then The user should be in Managers home page
    And The user closes the browser

  @tag2
  Scenario: Verify the login with invalid credentials
    Given The user is in the Guru login Page
    When The user enters the invalid credentials
    And The user clicks the login button
    Then The user unable to login
    And The user closes the browser

  @tag3
  Scenario: Create a new customer
    Given The user is in the Guru login Page
    When The user enters the valid credentials
    And The user clicks the login button
    And The user should be in Managers home page
    And The user clicks the New Customer
    And The user fills all the basic details requested on the page
      | customername | Vicky |
      | dob | 10091987 |
      | address | 72 2nd cross Nanganallur |
      | city | Chennai |
      | state | Tamilnadu |
      | pin | 600061 |
      | mobile | 9875463215 |
      | email | vigmn@gmail.com |
      | password | vig@123 |
    And The user clicks on Submit
    Then The user should receive a Customer ID
    And The user closes the browser
    
    @tag4
  Scenario: User tries to Create a new customer with already used email ID
    Given The user is in the Guru login Page
    When The user enters the valid credentials
    And The user clicks the login button
    And The user should be in Managers home page
    And The user clicks the New Customer
    And The user fills all the basic details requested on the page
      | customername | Vicky |
      | dob | 10091987 |
      | address | 72 2nd cross Nanganallur |
      | city | Chennai |
      | state | Tamilnadu |
      | pin | 600061 |
      | mobile | 9875463215 |
      | email | vig@gmail.com |
      | password | vign@123 |
    And The user clicks on Submit
    Then The user unable to create a new customer entry because the email ID used already
    And The user closes the browser
