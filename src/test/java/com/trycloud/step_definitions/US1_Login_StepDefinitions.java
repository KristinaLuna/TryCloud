package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_Login_StepDefinitions {

    LoginPage login = new LoginPage();

    @Given("user on the login page US1")
    public void user_on_the_login_page() {
      // String url = ConfigurationReader.getProperty("trycloud.net.url");
       //Driver.getDriver().get(url);
        Driver.getDriver().get(ConfigurationReader.getProperty("trycloud.net.url"));
    }


    @When("user use username {string} and passcode {string} US1")
    public void user_use_username_and_passcode(String username, String password) {
        login.inputUsername.sendKeys(username);
        login.inputPassword.sendKeys(password);

    }

    @When("user click the login button US1")
    public void user_click_the_login_button() {
       login.submitButton.click();
    }

    @Then("verify the user should be at the dashboard page US1")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

    }
}
