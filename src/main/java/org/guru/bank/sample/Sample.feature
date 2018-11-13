#Author: your.email@your.domain.com

@tag
Feature: To test the Login feature

  @tag1
  Scenario: Verify the login with valid credentials
    Given The user is in the Guru login Page
    When The user enters the valid credentials
    And The user clicks the login button
    Then The user should be in Managers home page
    
    @tag2
  Scenario: Verify the login with invalid credentials
    Given The user is in the Guru login Page
    When The user enters the invalid credentials
    And The user clicks the login button
    Then The user unable to login
 