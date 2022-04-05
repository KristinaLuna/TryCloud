package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.geom.QuadCurve2D;
import java.util.List;

public class FilesModulePage extends BasePage {

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath="//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;
   // @FindBy (xpath = "//div[@id='app-settings-content']//input[@type='checkbox']")
    //public List<WebElement> settingsCheckboxes;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> actionIcons;

    @FindBy(xpath = "(//a[@data-action='menu'])[1]")
    public WebElement actionIcon;

    @FindBy(xpath = "//span[@class='icon icon-starred']")
    public WebElement favoriteIcon;

    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement chosenToFavoriteFile;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> filesInFavoritesModules;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoritesModules;

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

    //irena
    @FindBy(xpath = "//tr[@data-file='DO NOT DELETE.docx']//a/span[@class='icon icon-more']")
    public WebElement treeDotsIrena;
    //irena
    @FindBy(xpath = "//tr[@data-file='DO NOT DELETE.docx']") // (//span[.='.docx'])[2]
    public WebElement doNotDeleteFile;
    //irena
    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileButtonIrena;
    //irena
    @FindBy(xpath = "//tr[@data-file='Upload File!.docx']")
    public WebElement uploadedFile;
    //irena
    @FindBy(xpath = "//tr[@data-file='Upload File!.docx']//span[@class='fileactions']//a[@data-action='menu']")
    public WebElement uploadedFileThreeDots;




}
