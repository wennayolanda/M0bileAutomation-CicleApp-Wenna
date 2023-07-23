Feature: Headquarter Group Chat menu

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    And user click Don't Allow button
    And user click existing company
    When user click existing Headquarter card
    Then user click Group Chat menu

  Scenario: Verify that the Send Chat button is functioning properly
    When user types "trying to send a message in group chat" in the chat box
    Then user clicks Send button
