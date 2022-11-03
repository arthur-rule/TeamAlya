@FLEETG-1416
Feature:Login Functionality Text Execution

  Background:
    Given user is on the login page

  @FLEETG-1558
    Scenario: Bullet signs
      When :user enters to password "UserUser123"
      Then :password should see bullet signs