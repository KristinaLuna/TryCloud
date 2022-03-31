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
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US10_UpdateSettingsDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboard = new DashboardPage();
    FilesModulePage files = new FilesModulePage();
    String storageBeforeUpload;


    @When("user clicks the Files module")
    public void user_clicks_the_files_module() {
        BrowserUtils.waitForVisibility(dashboard.filesModule, 5);
        dashboard.filesModule.click();
    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        //BrowserUtils.waitFor(5);
        files.settingsBtn.click();
    }
    @Then("user should be able to click any buttons")
    public void user_should_be_able_to_click_any_buttons() {
        //  WebElement checkBox =Driver.getDriver().findElement(By.xpath("(//div[@id='app-settings-content']//label)"));
        for (int i = 1; i <= 3; i++) {
            WebElement checkBox = Driver.getDriver().findElement(By.xpath("(//div[@id='app-settings-content']//label)[" + i + "]"));
            BrowserUtils.waitFor(5);
            boolean beforeClick = files.checkBoxes.get(i).isSelected();
            checkBox.click();
            boolean afterClick =  files.checkBoxes.get(i).isSelected();
            Assert.assertNotEquals(beforeClick, afterClick);
        }

    }

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {
        System.out.println("Storage usage before upload = " + files.numberOfUsage.getText());
        storageBeforeUpload = files.numberOfUsage.getText();
    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
            // BrowserUtils.waitFor(2);
            files.addIcon.click();

            String path= "D:\\soft skills\\1.Interview Prep - SDLC & Agile & STLC - Google Docs.pdf";
            BrowserUtils.waitFor(3);

            files.uploadFileBtn.click();// Click on browse option on the webpage
            BrowserUtils.waitFor(2);// suspending execution for specified time period

            // creating object of Robot class
            Robot rb = null;
            try {
                rb = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }

            // copying File path to Clipboard
            StringSelection str = new StringSelection(path);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

            // press Contol+V for pasting
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);

            // release Contol+V for pasting
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);

            // for pressing and releasing Enter
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
            BrowserUtils.waitFor(3);
        }


    @And("user refreshes the page")
    public void userRefreshesThePage() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(3);

    }

    @Then("user should be able to see storage usage is increased")
    public void userShouldBeAbleToSeeStorageUsageIsIncreased() {
        WebElement numberOfUsage2 = files.numberOfUsage;
        System.out.println("Storage usage after upload = " + numberOfUsage2.getText());
        double n1 = Double.parseDouble(storageBeforeUpload.substring(0,storageBeforeUpload.indexOf(" ")));
        String storageAfterUpload = numberOfUsage2.getText();
        double n2 = Double.parseDouble(storageAfterUpload.substring(0, storageAfterUpload.indexOf(" ")));
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        boolean b = n2 > n1;
        Assert.assertTrue(b);

        //remove uploaded file
        files.FileOption3Dots.click();
        files.deleteFileOption.click();

    }
    }