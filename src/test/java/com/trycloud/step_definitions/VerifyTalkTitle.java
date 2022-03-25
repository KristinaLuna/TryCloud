package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTalkTitle {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        loginPage.login();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String talk) {
        homePage.talkModule.click();


    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String title) {
        BrowserUtils.verifyTitle(title);
    }

}
