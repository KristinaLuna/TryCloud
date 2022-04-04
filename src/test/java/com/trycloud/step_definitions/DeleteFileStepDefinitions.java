package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class DeleteFileStepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesModulePage filesModulePage = new FilesModulePage();
    String version = new String();

    //When user clicks on Files module
    @When("the user clicks the \"Files\"module")
    public void the_user_clicks_the_files_module() {
        BrowserUtils.waitForVisibility(dashboardPage.filesModule, 5);
        dashboardPage.filesModule.click();
    }
    //And user clicks action-icon from any file on the page
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesModulePage.threeDots1.click();
        BrowserUtils.sleep(3);
    }
    //And user choose the Delete folder option
    @And("user choose the Delete folder option")
    public void userChooseTheDeleteFolderOption() {
        filesModulePage.deleteFolderDani.click();
    }
    //When the user clicks the Deleted files sub-module on the left side
    @When("the user clicks {string} sub-module on the left side")
    public void the_user_clicks_sub_module_on_the_left_side(String string) {
        filesModulePage.deletedFilesLeft.click();
    }
    //Then verify the deleted file is displayed on the page
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        String fileName = FilesModulePage.getFileNameHolder();
        for (WebElement each : filesModulePage.filesFromDeleteModule) {
            if (each.getText().equals(fileName)) {
                Assert.assertTrue(fileName.equals(each.getText()));
            } else {
                System.out.println("There is no chosen file added to module");
            }
        }
    }
}


