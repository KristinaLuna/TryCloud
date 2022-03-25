Feature: As a user, I should be able to access to Contacts module

  Scenario:  verify user access to Talks module
    Given user is on the dashboard page
    When the user clicks the "Talk" module
    Then verify the page title is "Talk - Trycloud QA"