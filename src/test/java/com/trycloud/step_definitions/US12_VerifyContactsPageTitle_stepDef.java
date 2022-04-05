package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US12_VerifyContactsPageTitle_stepDef {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks the {string} module US12")
    public void the_user_clicks_the_module_us12(String contactsModule) {

        dashboardPage.clickModule(contactsModule);

    }
    @Then("verify the page title is {string} US12")
    public void verify_the_page_title_is_us12(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);

    }
}
