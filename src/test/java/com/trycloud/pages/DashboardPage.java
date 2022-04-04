package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {

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


    //this method loops through all modules on homePage and selects the module whose attribute value was passed as String attributeValue
    public static void selectModule(List<WebElement> appMenuModules, String attributeValue){

        for (WebElement each : appMenuModules) {

            if (each.getAttribute("aria-label").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }

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
