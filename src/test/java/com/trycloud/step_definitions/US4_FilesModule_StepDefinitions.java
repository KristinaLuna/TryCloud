package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US4_FilesModule_StepDefinitions {
    LoginPage loginPage= new LoginPage();

    @Given("User on the Dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("trycloud.net.url"));
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("username1"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submitButton.click();
    }

    @When("User clicks the {string} module")
    public void userClicksTheModule(String arg0) {
    }

    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verifyThePageTitleIsFilesTrycloudQA() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}
