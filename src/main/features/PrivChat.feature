Feature: Private Chat

  Background:User already login and enters private chat feature
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    And user click Don't Allow button
    When user click existing company
    And user click menu icon and inbox icon
    Then user click Start Chat button

  Scenario: Verify that the Send Chat button is functioning properly
    Given user choose contact from list
    When user types "trying to send a message" in the chat box
    Then user clicks Send button
