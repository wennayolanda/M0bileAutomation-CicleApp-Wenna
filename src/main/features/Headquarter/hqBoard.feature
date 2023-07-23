Feature: Headquarter Board menu

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    And user click Don't Allow button
    And user click existing company
    When user click existing Headquarter card
    Then user click Board menu

  Scenario: Verify that the user is able to create the Board list
    Given user click add button
    When user input "list satu" in board list textbox
    Then user clicks Submit List Board button

  Scenario: Verify that the user is able to create new task card
    Given user clicks Add new card button
    When user input "task pertama" in task textbox
    And user clicks done icon
