@regression
Feature: As a user, I should be accessing all the main modules of the app.

  Scenario Outline: Verify users accessing all the main modules of the app.
    Given user is on the login page
    When the user log in with valid "<username>" and "<password>"
    Then verify the user see the following modules:
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

    Examples:
      | username | password    |
      | user22   | Userpass123 |
      | user52   | Userpass123 |
      | user82   | Userpass123 |
      | user112  | Userpass123 |