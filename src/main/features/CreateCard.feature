Feature: Card

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    And user click Don't Allow button
    Then user click existing company

  Scenario: Verify that user can create HQ card successfully
    Given user click add button
    When user click Add New HQ card button
    And user input "QA Headquarter" in name field
    And user input "Quality Assurance" in description field
    Then user click Create button

  Scenario: Verify that user can create Team card successfully
    Given user click add button
    When user click Add New Team card button
    And user input "QA Division" in name field
    And user input "Quality Assurance" in description field
    Then user click Create button

  Scenario: Verify that user can create Project card successfully
    Given user click add button
    When user click Add New Project card button
    And user input "QA Projects" in name field
    And user input "Quality Assurance" in description field
    Then user click Create button