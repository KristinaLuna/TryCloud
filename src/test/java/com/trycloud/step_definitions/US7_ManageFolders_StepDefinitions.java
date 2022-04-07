package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US7_ManageFolders_StepDefinitions {

    LoginPage login = new LoginPage();
    FilesModulePage files = new FilesModulePage();
    DashboardPage dashboard = new DashboardPage();

    @When("the user clicks the {string} module US7")
    public void the_user_clicks_the_module_us7(String string) {
        dashboard.filesModule.click();
    }


    @When("user clicks the add icon on the top module US7")
    public void user_clicks_the_add_icon_on_the_top_module_us7() {
        files.addIcon.click();
    }

    @When("user click \"new folder” module US7")
    public void user_click_new_folder_module_us7() {
        files.addNewFolder.click();
    }

    @When("user write a folder name module US7")
    public void user_write_a_folder_name_module_us7() {
        files.inputFolderName.sendKeys("Testing1");
    }

    @When("the user click submit icon module US7")
    public void the_user_click_submit_icon_module_us7() {
        BrowserUtils.waitForClickablility(files.submit, 8);
        files.submit.click();
    }


    @Then("Verify the folder is displayed on the page module US7")
    public void verify_the_folder_is_displayed_on_the_page_module_us7() {
        WebElement folder = Driver.getDriver().findElement(By.xpath("//span[text()=\"Testing1\"]"));
        BrowserUtils.waitForClickablility(folder, 7);
        Assert.assertTrue(folder.isDisplayed());
    }

    @When("user choose a folder from the page module US7")
    public void user_choose_a_folder_from_the_page_module_us7() {
        WebElement folder = Driver.getDriver().findElement(By.xpath("//span[text()=\"Testing\"]"));
        BrowserUtils.waitForClickablility(folder, 7);
        folder.click();
    }

    @When("the user uploads a file with the upload file option module US7")
    public void the_user_uploads_a_file_with_the_upload_file_option_module_us7() {

    }

    @Then("Verify the file is displayed on the page module US7")
    public void verify_the_file_is_displayed_on_the_page_module_us7() {
        files.addIcon.click();
        String filePath = "C:\\Users\\humas\\OneDrive\\Desktop\\Cybertek School _ Learn_files\\findElementvs.findElements.png";
        //files.uploadFile.sendKeys(filePath);
        files.upload.sendKeys(filePath);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        WebElement fileAdded = Driver.getDriver().findElement(By.xpath("//span[text()='findElementvs.findElements']"));
        Assert.assertTrue(fileAdded.isDisplayed());
    }
}














