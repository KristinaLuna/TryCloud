@us_03 @smoke @regression
Feature: As a user, I should be access all the main modules of the app.

  Background:
    Given user on the login page

  @enes
  Scenario: As a user, I should be access all the main modules of the app US3.
    When user  log in with valid credentials USenes.
    Then Verify the user see the following modules USenes.
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |