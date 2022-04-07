package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class US6_RemoveFilesAndUploadFile_StepDefinition {

    DashboardPage dashboardPage = new DashboardPage();
    FilesModulePage filesModulePage = new FilesModulePage();

    @When("the user clicks the {string} module US6")
    public void the_user_clicks_the_module_us6(String filesModule) {

        dashboardPage.clickModule(filesModule);
    }

    @When("the users click action-icon from any file on the page to remove US6")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove_us6() {

        filesModulePage.treeDotsIrena.click();
        BrowserUtils.waitFor(2);
    }

    @When("user choose the {string} option US6")
    public void user_choose_the_option_us6(String removeFromFavorites) {

        filesModulePage.removeFromFavorites.click();
        BrowserUtils.waitFor(2);
    }

    @When("user click the {string} sub-module on the left side US6")
    public void user_click_the_sub_module_on_the_left_side_us6(String favoritesSubmodule) {

        filesModulePage.favoritesSubmodule.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table US6")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table_us6() {

        try {
            Assert.assertFalse(filesModulePage.doNotDeleteFile.isDisplayed());
        }catch (NoSuchElementException e){
            System.out.println("File is removed from favorites");
        }

        dashboardPage.filesModule.click();
        filesModulePage.treeDotsIrena.click();
        BrowserUtils.waitFor(2);
        filesModulePage.addToFavorites.click();
    }

    @When("the user clicks the add icon on the top US6")
    public void the_user_clicks_the_add_icon_on_the_top_us6() {

        filesModulePage.addIcon.click();
    }

    @When("users uploads file with the {string} option US6")
    public void users_uploads_file_with_the_option_us6(String uploadFile) {

        String path = "/Users/irena/Desktop/Upload File!.docx";
        filesModulePage.uploadFileButtonIrena.sendKeys(path);
        BrowserUtils.waitFor(2);
    }

    @Then("verify the file is displayed on the page US6")
    public void verify_the_file_is_displayed_on_the_page_us6() {

        Driver.getDriver().navigate().refresh();
        Assert.assertTrue(filesModulePage.uploadedFile.isDisplayed());

        filesModulePage.uploadedFileThreeDots.click();
        BrowserUtils.waitFor(2);
        filesModulePage.deleteFileOption.click();
        BrowserUtils.waitFor(2);
    }


}
