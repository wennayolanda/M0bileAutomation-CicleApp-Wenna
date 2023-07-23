Feature: Team Check-Ins menu

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    And user click Don't Allow button
    And user click existing company
    When user click existing Team card
    Then user click CheckIns menu