Feature: As a user, I should be able to remove files from favorites and upload a file directly
  @Irena
  Scenario: verify users to remove files to Favorites
    Given user on the dashboard page US6
    When the user clicks the "Files" module US6
    When the users click action-icon from any file on the page to remove US6
    And  user choose the "Remove from favorites" option US6
    And user click the "Favorites" sub-module on the left side US6
    Then Verify that the file is removed from the Favorites sub-module’s table US6

  Scenario: verify users to upload a file from Files
    Given user on the dashboard page US6
    When the user clicks the "Files" module US6
    When the user clicks the add icon on the top US6
    And users uploads file with the "upload file" option US6
    Then verify the file is displayed on the page US6