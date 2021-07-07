@tag
Feature: Title of your feature
  I want to use this template for my feature file

  # @Login1
  # Scenario: Verify the login functionality
  #  Given I want to launch the browser
  #And open the URL
  #  When I enters username and password
  #And press the submit button
  # Then I validate the outcomes
  #And check more outcomes
  @tag2
  Scenario Outline: Verify the login Credential
    Given I want to open application
    When I check for a Username with "<name>" the "<passcode>" in step
    Then I verify the "<status>" in step

    Examples: 
      |name            |passcode       | status  |
      | Anita.Karthesan | WelcomeHub2020 | success |
      | Kalvin.Fernads  | ABC.gyt        | Fail    |
      | Nicholas.Crotty | ABCDE12        | Fail    |
