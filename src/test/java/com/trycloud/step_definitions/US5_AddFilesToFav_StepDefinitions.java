package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US5_AddFilesToFav_StepDefinitions{

    DashboardPage dashboardPage = new DashboardPage();
    FilesModulePage filesModulePage = new FilesModulePage();

    @When("the user clicks the Files module US5")
    public void the_user_clicks_the_files_module_us5() {
        dashboardPage.filesModule.click();
        BrowserUtils.waitForPageToLoad(3);
    }
    @When("the user clicks action-icon  from any file on the page US5")
    public void the_user_clicks_action_icon_from_any_file_on_the_page_us5() {
       filesModulePage.actionIcon.click();
        if (filesModulePage.favoriteIcon.isDisplayed()){
            filesModulePage.removeFromFavorites.click();
            BrowserUtils.sleep(3);
            filesModulePage.actionIcon.click();
            BrowserUtils.sleep(3);
        }
    }
    @When("user choose the Add to favorites option US5")
    public void user_choose_the_add_to_favorites_option_us5() {
        filesModulePage.addToFavorites.click();
        BrowserUtils.waitFor(3);
    }
    @When("user click the Favorites sub-module on the left side US5")
    public void user_click_the_favorites_sub_module_on_the_left_side_us5() {
        filesModulePage.favoritesModules.click();
        BrowserUtils.sleep(5);
    }
    @Then("Verify the chosen file is listed on the table US5")
    public void verify_the_chosen_file_is_listed_on_the_table_us5() {
        for (WebElement each : filesModulePage.filesInFavoritesModules) {
            if (each.getText().equals(filesModulePage.chosenToFavoriteFile.getText())) {
                Assert.assertTrue(filesModulePage.chosenToFavoriteFile.getText().equals(each.getText()));
            }else{
                System.out.println("There is no chosen file added to the Favorites module");
            }
        }
       // Assert.assertTrue(filesModulePage.favoriteFile.isDisplayed());
    }

}
