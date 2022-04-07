

@US7_Huma
Feature: As a user, I should be able to remove files from the favorites and upload a file directly

  Story: As a user, I should be able to manage folders.



  Scenario: As a user, I should be able to add the folder
    Given user on the dashboard page
    When the user clicks the "Files" module US7
    And user clicks the add icon on the top module US7
    And user click "new folder” module US7
    And user write a folder name module US7
    When the user click submit icon module US7
    Then Verify the folder is displayed on the page module US7


  Scenario: As a user, I should be able to upload a file inside a folder
    Given user on the dashboard page
    When the user clicks the "Files" module US7
    And user choose a folder from the page module US7
    And user clicks the add icon on the top module US7
    When the user uploads a file with the upload file option module US7
    Then Verify the file is displayed on the page module US7