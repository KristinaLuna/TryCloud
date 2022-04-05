package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TalkModulePage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@aria-label='Conversation, User19']")
    public WebElement user19;

    @FindBy(css = "button[aria-label='Send message']")
    public WebElement submit_button;

    @FindBy(css = "div[placeholder='Write message, @ to mention someone …']")
    public WebElement msgBox;

    @FindBy(xpath="//div[starts-with(@id,'message_')]")
    public List<WebElement> displayedMsg;


}
