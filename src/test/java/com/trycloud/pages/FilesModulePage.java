package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesModulePage extends BasePage {

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "(//p[text()])[1]")
    public WebElement numberOfUsage;

    @FindBy(css = "span[class='icon icon-add']")
    public WebElement icon_add;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFileBtn;

}
