Feature: Create Company

  Background: User already sign in to app
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    Then user click Don't Allow button

  Scenario: Verify that user can create company successfully
    Given user click create new company button
    When user input "NewCorp" in name field
    And user input "SaaS" in description field
    Then user click Create button