
@login

Feature: Users should be able to login
  @driver @login
  Scenario: Login as a driver

    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
  @login
  Scenario: Login as a sales manager

    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

  @store_manager
  Scenario: Login as a stores manager

    Given the user is on the login page
    When the user enters the stores manager information
    Then the user should be able to login
