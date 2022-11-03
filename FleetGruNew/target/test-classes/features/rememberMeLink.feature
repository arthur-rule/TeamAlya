@FLEETG-1416
Feature:Login Functionality Text Execution

  Background:
    Given user is on the login page


  @FLEETG-1557
  Scenario: Remember Me Link
    When user should see  "Remember me on this computer" link
    And user select Remember Me checkbox
    Then user should see clickable