<<<<<<< HEAD
@SmokeTest
Feature: Verify Dropdown box
  As a user of the system
  I should be able to use the Product sort dropdown
  So that i can sort the products and display the selected option

Background: Navigate
  Given the user navigate to "Swag Labs" page
  When the user login with "standard_user" username and "secret_sauce" password
  And the user click on login button
  Then the user should see "Products"


  Scenario: 1. Verify the number of options in Product dropdown box
    Then the user should see the 4 options in the dropdown box

Scenario: 2. Verify that the user can select an option from the dropdown box
  When the user click on the product sort dropdown
  And the user select "Price(high to low)" option from product sort dropdown
  Then the user should see "Price(high to low)" option is selected

  Scenario Outline: 3. Verify that the user can select an option from Product sort dropdown
    When the user click on the product sort dropdown
    And the user select "<option>" option from product sort dropdown
    Then the user should see "<option>" option is selected

    Examples:
    | option            |
    | Name (A to Z)       |
    | Name (Z to A)       |
    | Price (low to high) |
    | price (high to low) |



