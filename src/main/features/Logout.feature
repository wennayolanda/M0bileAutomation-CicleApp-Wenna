Feature: Logout

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    Then user click Don't Allow button


  Scenario: User successfully logout
    Given user click existing company
    When user click menu icon
    Then user click logout button