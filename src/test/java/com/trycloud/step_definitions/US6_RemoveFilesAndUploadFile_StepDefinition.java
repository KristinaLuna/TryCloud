package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;

public class US6_RemoveFilesAndUploadFile_StepDefinition {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesModulePage filesModulePage = new FilesModulePage();

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String filesModule) {
        try {
            DashboardPage.selectModule(dashboardPage.fileActionMenu, filesModule);
        }catch (StaleElementReferenceException st){
            System.out.println("StaleElementReferenceException is catch");
        }
    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
    }


    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
    }

    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {
    }

    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
    }



}
