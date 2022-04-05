package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class US14_SearchIconDefinitions {

    DashboardPage dashboardPage=new DashboardPage();

    @When("the user clicks the magnifier icon on the right top US14")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top_us14() {
        BrowserUtils.sleep(2);
        dashboardPage.searchIcon1.click();
    }
    @When("users search any existing file or folder or user name and verify the app displays the expected result option US14")
    public void users_search_any_existing_file_or_folder_or_user_name_and_verify_the_app_displays_the_expected_result_option_us14
            (Map<String,String> nameOfValue) {
        BrowserUtils.sleep(2);
        for (String value : nameOfValue.values()) {
            dashboardPage.searchIconWindow.sendKeys(value);
            String actualResult=dashboardPage.searchFiles.getText();
            System.out.println("actualTitle = " + actualResult);
            System.out.println("value = " + value);
            Assert.assertTrue(value.equals(actualResult));
            dashboardPage.resetSearch.click();
        }
    }
}
