
Feature: Log out Functionality Text Execution

  Background:
    Given user is on the login page


  Scenario: Close tab
    When user enters to username "user1"
    And user enters to password "UserUser123"
    And user clicks login button
    And user should see "Quick Launchpad"
    #Switch to new tab
    And user open login page on new tab
    And user should see "Quick Launchpad"
    And user click to profile menu
    And user clicks to log out button
    And user should see login page
    #Switch to old tab
    And user refresh the page at old tab
    Then user should see login page