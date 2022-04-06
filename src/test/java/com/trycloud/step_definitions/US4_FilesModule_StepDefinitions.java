package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US4_FilesModule_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesModulePage filesModulePage = new FilesModulePage();


    @Given("user on the dashboard page us")
    public void user_on_the_dashboard_page_us() {
        Driver.getDriver().get(ConfigurationReader.getProperty("trycloud.net.url"));
        loginPage.Login();
    }

    @When("the user clicks the {string} module us")
    public void the_user_clicks_the_module_us(String module) {
        dashboardPage.filesModule.click();
    }

    @Then("verify the page title is \"Files - Trycloud QA.” us")
    public void verify_the_page_title_is_files_trycloud_qa_us() {
        String expectedTitle = "Files - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        filesModulePage.selectAllFiles.click();

    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        for (WebElement checkBox : filesModulePage.checkBoxes) {
            Assert.assertTrue(checkBox.isSelected());

        }

    }
}

