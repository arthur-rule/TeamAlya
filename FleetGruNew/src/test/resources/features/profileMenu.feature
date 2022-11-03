@FLEETG-1416
Feature:Login Functionality Text Execution

  Background:
    Given user is on the login page

  @FLEETG-1560
  Scenario Outline: Profile Menu
    When user enters to username "<username>"
    And user enters to password "<password>"
    And user press the enter key
    Then user should see own username "<username>"

    Examples: Valid Credentials
      | username        | password    |
      | user1           | UserUser123 |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |
