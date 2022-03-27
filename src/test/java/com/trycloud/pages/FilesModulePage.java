package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesModulePage extends BasePage {

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath="//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;

}
