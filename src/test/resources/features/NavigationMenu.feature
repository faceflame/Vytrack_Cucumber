@nav_menu @sales_manager
Feature: Navigation menu


  Scenario: Fleet ---> Vehicles
    Given the user is on login page
    And the user enters sales manager credentials
    When the user goes to Fleet, Vehicles
    Then the URL should be https://qa2.vytrack.com/entity/Extend_Entity_Carreservation


  Scenario: Fleet ---> Vehicles
    Given the user is on login page
    When the user enters sales manager credentials
    When the user goes to Activities, Calendar Events
    Then the URL should be https://qa2.vytrack.com/calendar/event


  Scenario: Fleet ---> Vehicles
    Given the user is on login page
    When the user enters sales manager credentials
    When the user goes to Marketing, Campaigns
    Then the URL should be https://qa2.vytrack.com/campaign/


    #gherkin