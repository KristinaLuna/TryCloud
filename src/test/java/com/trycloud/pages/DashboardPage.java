package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class DashboardPage extends BasePage{

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardModule;

    @FindBy(css="li[data-id='files']")
    public WebElement filesModule ;

    @FindBy(css ="li[data-id='spreed']")
    public WebElement talkModule;

    @FindBy(css="li[data-id='contacts']")
    public WebElement contactsModule ;

    @FindBy(xpath ="//div[@class='header-menu unified-search header-menu--opened']")
    public WebElement searchIcon;

    @FindBy(xpath = "//ul[@id='appmenu']/li/a")
    public List<WebElement> fileActionMenu;



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
}
