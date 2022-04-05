package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends BasePage{


    @FindBy(xpath = "//ul[@id='appmenu']//li[@id='more-apps']//preceding-sibling::li")
    public List<WebElement> modules;

    public List<String> getTextOfModules() {
        List<String> moduleTexts = new ArrayList<>();

        for (WebElement module : modules) {
            BrowserUtils.hover(module);
            BrowserUtils.sleep(2);
            moduleTexts.add(module.getText());
        }
        return moduleTexts;
    }

    public void clickModule(String moduleName) {
        String locator = "//span[.='" + moduleName + "']";

        Driver.getDriver().findElement(By.xpath(locator)).click();


    }
    @FindBy(xpath ="//a[@class='header-menu__trigger']")
    public WebElement searchIcon1;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchIconWindow;

    @FindBy(xpath = "//h3[@class='unified-search__result-line-one']")
    public WebElement searchFiles;

    @FindBy(xpath = "//*[@type='reset']")
    public WebElement resetSearch;

}
