package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FilesModulePage extends BasePage {

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;


    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> actionIcon;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesSubmodule;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//*[@id='controls']/div[2]/div[2]/ul/li[2]/a/span[2]")
    public WebElement addNewFolder;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement inputFolderName;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submit;

    @FindBy(xpath = "(//p[text()])[1]")
    public WebElement numberOfUsage;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "(//a[@data-action='menu']/span)[7]")
    public WebElement FileOption3Dots;

    @FindBy(xpath = "//span[.='Delete file']")
    public WebElement deleteFileOption;


    @FindBy(xpath = "//ul[@id='appmenu']//li[@id='more-apps']//preceding-sibling::li")
    public List<WebElement> modules;


}