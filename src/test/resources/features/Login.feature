@login @smoke
Feature: Users should be able to login

   @driver @VYT-123
  Scenario: Login as a driver
    Given the user is on login page
    When the user enters driver credentials
    Then the user should be able to login

  @sales_manager @VYT-123
  Scenario: Login as a sales manager
    Given the user is on login page
    When the user enters sales manager credentials
    Then the user should be able to login

  @store_manager @VYT-123
  Scenario: Login as a store manager
    Given the user is on login page
    When the user enters store manager credentials
    Then the user should be able to login


    #gherkin