
Feature: As a user, I should be able to access to Files module.

  Scenario: verify users can access to Files module
    Given user on the dashboard page us
    When the user clicks the "Files" module us
    Then verify the page title is "Files - Trycloud QA.” us

  @wip
  Scenario: verify users can select all the uploaded files from the page
    Given user on the dashboard page us
    When the user clicks the "Files" module us
    And user click the top-left checkbox of the table
    Then verify all the files are selected