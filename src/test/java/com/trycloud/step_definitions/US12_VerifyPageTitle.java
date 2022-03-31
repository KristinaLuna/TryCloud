package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class US12_VerifyPageTitle {


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {


        List<WebElement> allModules = Driver.getDriver().findElements(By.xpath("//*[@id=\"appmenu\"]/li"));
        DashboardPage.selectModule(allModules, "Contacts");
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Contacts - Trycloud QA");
    }
}
