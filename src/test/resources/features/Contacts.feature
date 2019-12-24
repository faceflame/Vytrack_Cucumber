Feature: Contacts page

  @contacts
  Scenario: Default page number
    Given a driver is logged in
    When the user goes to "Customers" "Contacts"
    Then default page number should be 1


  @menu_options
  Scenario: Menu options
    Given a driver is logged in
    Then the user should see the following menu options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |