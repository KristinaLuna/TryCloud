package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;

public class BaseStepDefinitions  {

    LoginPage loginPage = new LoginPage();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("trycloud.net.url"));
        loginPage.Login();
    }

}
