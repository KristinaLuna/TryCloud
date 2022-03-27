package com.trycloud.pages;

import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardPage {

    //this method loops through all modules on the homepage and selects the one you pass in String attributeValue
    public static void selectModule(List<WebElement> appMenuModules, String attributeValue){

        for (WebElement each : appMenuModules) {

            if (each.getAttribute("aria-label").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }

    }
}
