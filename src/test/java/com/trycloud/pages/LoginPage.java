package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="user")
    public WebElement inputUsername;

    @FindBy(id="password")
    public WebElement inputPassword;

    @FindBy(id="submit-form")
    public WebElement submitButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;

    public void Login(){
        inputUsername.sendKeys("User28");
        inputPassword.sendKeys("Userpass123");
        submitButton.click();
    }

    public void Login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        submitButton.click();
    }

}
