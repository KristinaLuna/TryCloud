package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesModulePage extends BasePage {

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath="//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> actionIcon;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesSubmodule;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addFileButton;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileButton;

}
