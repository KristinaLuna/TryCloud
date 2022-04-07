Feature: As a user, I should be able to access to Contacts module
@k
  Scenario:  verify user access to Contacts module
    Given user on the dashboard page
    When the user clicks the "Contacts" module US12
    Then verify the page title is "Contacts - Trycloud QA" US12