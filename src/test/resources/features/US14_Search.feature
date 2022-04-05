Feature: As a user, I should be able to search any item/ users from the homepage.
 @Nadi
  Scenario: Verify users can search any files/folder/users from the search box.
    Given user on the dashboard page
    When the user clicks the magnifier icon on the right top US14
    And users search any existing file or folder or user name and verify the app displays the expected result option US14
      | nameOfFiles  | Talk  |
      | nameOfFolder | Cydeo |
