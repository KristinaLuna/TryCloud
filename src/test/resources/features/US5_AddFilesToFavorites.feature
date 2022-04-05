Feature: As a user, I should be able to access to Files module - Favorites button

  @US5
  Scenario: Verify users to add files to Favorites
    Given user on the dashboard page
    When the user clicks the Files module US5
    And the user clicks action-icon  from any file on the page US5
    And user choose the Add to favorites option US5
    And user click the Favorites sub-module on the left side US5
    Then Verify the chosen file is listed on the table US5