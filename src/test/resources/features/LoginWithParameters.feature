Feature: Log in as different users

  @wip
  Scenario: Login as a driver user

    Given the user is on login page
    When user logs in "user11" and "UserUser123"
    Then the user should be able to login
    And the title should contain "Dashboard"

    @wip
  Scenario: Login as a sales manager user

    Given the user is on login page
    When user logs in "salesmanager115" and "UserUser123"
    Then the user should be able to login
    And the title should contain "Dashboard"

      @wip
  Scenario: Login as a store manager user
    Given the user is on login page
    When user logs in "storemanager85" and "UserUser123"
    Then the user should be able to login
    And the title should contain "Dashboard"

