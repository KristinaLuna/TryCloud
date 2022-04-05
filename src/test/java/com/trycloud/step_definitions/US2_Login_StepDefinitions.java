package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_Login_StepDefinitions {

    LoginPage login = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.getProperty("trycloud.net.url");
        Driver.getDriver().get(url);
    }


    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String string, String string2) {
        login.inputUsername.sendKeys(string);
        login.inputPassword.sendKeys(string2);

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        login.submitButton.click();

    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
        login.warningMessage.isDisplayed();
        Assert.assertTrue(login.warningMessage.getText().equals(string));

    }

}
