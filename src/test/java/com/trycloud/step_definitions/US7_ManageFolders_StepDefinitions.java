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


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("trycloud.net.url"));
        login.Login();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        dashboard.filesModule.click();
    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        files.addIcon.click();
    }
    @When("user click \"new folder”")
    public void user_click_new_folder() {
        files.addNewFolder.click();
    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {
        files.inputFolderName.sendKeys("Testing1");
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        BrowserUtils.waitForClickablility(files.submit,8);
        files.submit.click();
    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        WebElement folder = Driver.getDriver().findElement(By.xpath("//span[text()=\"Testing1\"]"));
        BrowserUtils.waitForClickablility(folder,7);
        Assert.assertTrue(folder.isDisplayed());
    }



    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        WebElement folder = Driver.getDriver().findElement(By.xpath("//span[text()=\"Testing\"]"));
        BrowserUtils.waitForClickablility(folder,7);
        folder.click();
    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        files.addIcon.click();
        String filePath = "C:\\Users\\humas\\OneDrive\\Desktop\\Cybertek School _ Learn_files\\findElementvs.findElements.png";
        //files.uploadFile.sendKeys(filePath);
        files.upload.sendKeys(filePath);


    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
   WebElement fileAdded = Driver.getDriver().findElement(By.xpath("//span[text()='findElementvs.findElements']"));
   Assert.assertTrue(fileAdded.isDisplayed());
    }
}
