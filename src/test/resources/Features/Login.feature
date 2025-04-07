@regression
Feature: Login functionality

  Background:
    Given The user is on the login page


  @positiveTest
  Scenario: User should be able to login with valid username and password
    When The user logs in as standard_user
    Then The user should be able to see "Products" title


  @negativeTest
  Scenario Outline: User CANNOT be able to login with invalid username and password, or with locked_out user
    When The user logs in using "<username>" and "<password>"
    Then The warning message is "<Warning Message>"

    Examples:
      | username        | password     | Warning Message                                                           |
      | Standard_user   | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      |                 |              | Epic sadface: Username is required                                        |
      | testUser        |              | Epic sadface: Password is required                                        |
      | testUser        | test123      | Epic sadface: Username and password do not match any user in this service |
      | standard_user   | test123      | Epic sadface: Username and password do not match any user in this service |