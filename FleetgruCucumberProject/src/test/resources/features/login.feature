@FLEETG-1523
Feature: Login-With parameters and Scenario Outlines

  Background:
    Given The user is on the login page

  @FLEETG-1522
  Scenario Outline: Login as a <userType>
    When The user logs in as a "<userType>"
    Then The user is on the "<pageSubTitle>"
    Examples:
      | userType     | pageSubTitle    |
      | Driver       | Quick Launchpad |
      | SalesManager | Dashboard       |
      | StoreManager | Dashboard       |



