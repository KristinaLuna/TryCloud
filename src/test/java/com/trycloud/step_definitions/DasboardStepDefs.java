package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DasboardStepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    @When("user  log in with valid credentials")
    public void user_log_in_with_valid_credentials() {
        new LoginPage().Login();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModulesNames) {
        List<String> actualModuleNames = dashboardPage.getTextOfModules();

        Assert.assertEquals(expectedModulesNames, actualModuleNames);

    }

}
