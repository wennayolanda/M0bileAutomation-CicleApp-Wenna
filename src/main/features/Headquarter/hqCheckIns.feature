Feature: Headquarter Check-Ins menu

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    And user click Don't Allow button
    And user click existing company
    When user click existing Headquarter card
    Then user click CheckIns menu

#  Scenario: User creating a check-in question by entering a question title
#  and selecting a day of the week
#    Given user click add button
#    When user input "this is the question" in check-ins question box
#    And select "Thu" day button
#    And user clicks start collecting answer button
#    Then alert message is visible