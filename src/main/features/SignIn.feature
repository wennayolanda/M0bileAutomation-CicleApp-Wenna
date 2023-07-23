Feature: SignIn

  Scenario: User login into Cicle app using valid credential
    Given user open the application
    When user click Skip label and click Sign In button
    And user click Google button and select valid email
    Then user click Don't Allow button