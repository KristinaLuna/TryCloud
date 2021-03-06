package com.trycloud.step_definitions;


import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US3_TestHomePageModules_StepDef {

    LoginPage loginPage = new LoginPage();
    FilesModulePage filesModulePage = new FilesModulePage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user log in with valid {string} and {string}")
    public void theUserLogInWithValidAnd(String username, String password) {
        loginPage.Login(username, password);
        BrowserUtils.sleep(5);
    }

    @Then("verify the user see the following modules:")
    public void verifyTheUserSeeTheFollowingModules(List<String> expectedModuleNames) {

       List <String>actualModuleNames =  dashboardPage.getTextOfModules();


        assertEquals(expectedModuleNames, actualModuleNames);

    }
}