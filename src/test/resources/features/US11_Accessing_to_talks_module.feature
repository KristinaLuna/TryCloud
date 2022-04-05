Feature: US_11 As a user, I should be able to access to Talks module


  Scenario: verify users to access to Talks module
    Given user on the dashboard page
    When user clicks the "Talk" module
    Then verify the page title is "Talk - Trycloud QA"


  Scenario: verify user is able to send a message
    Given user on the dashboard page
    When user clicks the "Talk" module
    And user searches User19 user from the search box
    And user writes a message
    And user clicks submit button
    Then user should be able to see the message is displayed on the conversation log