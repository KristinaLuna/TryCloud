package com.trycloud.step_definitions;

import com.trycloud.pages.US3_DashboardPage;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US3_DasboardStepDefs {
    US3_DashboardPage us3_dashboardPage=new US3_DashboardPage();

    @When("user  log in with valid credentials USenes.")
    public void userLogInWithValidCredentialsUSenes() {
        new LoginPage().Login();
    }

    @Then("Verify the user see the following modules USenes.")
    public void verifyTheUserSeeTheFollowingModulesUSenes(List<String> expectedModulesNames) {
        List<String> actualModuleNames = us3_dashboardPage.getTextOfModules();

        Assert.assertEquals(expectedModulesNames, actualModuleNames);
    }
}




    /*
    @When("user  log in with valid credentials")
    public void user_log_in_with_valid_credentials() {
        new LoginPage().Login();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModulesNames) {
        List<String> actualModuleNames = dashboardPage.getTextOfModules();

        Assert.assertEquals(expectedModulesNames, actualModuleNames);

    }*/




