
@Navigation_Menu
Feature: Navigation Menu


  Scenario: Navigating Fleet -- Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates ti Fleet, Vehicles
    Then the title should be Vehicles


    Scenario: Navigating Markeing - Campaigns
      Given the user is on the login page
      And the user enters the sales manager information
      When the user navigates to Maketing, Campaigns
      Then the title should be Campaigns


      Scenario: Navigating Activities -- Calender Events
        Given the user is on the login page
        And the user enters the sales manager information
        When the user navigates to Activities, Calendar Events
        Then title should be Calendars