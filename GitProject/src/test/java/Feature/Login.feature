@SmokeTest
Feature: Verify Login Page
  As a user of the system
  I should be able to login with valid credentials
  so that I can login  into my account

  Background: Navigate
    Given the user navigates to "Swag Labs" page


    Scenario: 1. Verify login with Valid credentials
      When the user login with "standard_user" username and "secret_sauce" password
      And the user click on login button
      Then the user should see "Products"
      And the user clicks on logout button
