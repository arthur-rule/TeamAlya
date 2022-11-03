
Feature: Log out Functionality Text Execution

  Background:
    Given user is on the login page


  Scenario: back button
    When user enters to username "user1"
    And user enters to password "UserUser123"
    And user clicks login button
    And user click to profile menu
    And user clicks to log out button
    And user clicks to back button
    Then user should see login page

