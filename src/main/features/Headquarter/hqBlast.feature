Feature: Headquarter Blast Menu

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    And user click Don't Allow button
    And user click existing company
    When user click existing Headquarter card
    Then user click Blast menu

  Scenario: User successfully create and publish a blast
    Given user click add button
    When user input blast title "First Blast"
    And user input blast desc "Percobaan pertama"
    Then user clicks publish blast button