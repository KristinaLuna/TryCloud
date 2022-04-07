package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesModulePage extends BasePage {

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath="//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy(xpath = "//*[@id='controls']/div[2]/div[2]/ul/li[2]/a/span[2]")
    public WebElement addNewFolder;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement inputFolderName;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submit;

    @FindBy(xpath ="//span[text()='Upload file']")
    public WebElement uploadFile;

    @FindBy (xpath = "//input[@id='file_upload_start']")
    public WebElement upload;

    @FindBy(xpath = "(//p[text()])[1]")
    public WebElement numberOfUsage;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "(//a[@data-action='menu']/span)[7]")
    public WebElement FileOption3Dots;

    @FindBy(xpath = "//span[.='Delete file']")
    public WebElement deleteFileOption;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement comments;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitMessage;

    @FindBy(xpath = "//*[.='Details']")
    public  WebElement details;
    @FindBy(xpath = "//div[@class='message']")
    public WebElement message;
    @FindBy(xpath = "(//div [.='good job'])[1]")
    public WebElement seePost;
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[2]/a[2]/span[1]")
    public WebElement actionIcons;

    //from Daniela
    @FindBy(xpath = "(//span[@class='icon icon-more'])[3]")
    public WebElement threeDots1;
    //from Daniela
    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFilesLeft;
    //from Daniela
    @FindBy(xpath = "(//div[@class='thumbnail'])[3]")
    public WebElement deletedModule;
    //from Daniela
    @FindBy(xpath = "//span[.='Delete folder']")
    public WebElement deleteFolderDani;
    //from Daniela
    @FindBy(xpath = "//span[.='Delete file']")
    public WebElement deleteFileDani;
    //from Daniela
    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement>filesFromDeleteModule;
   //from Daniela
   @FindBy(xpath = "(//span[@class='innernametext'])[2]")
   public WebElement choosenFile;
   //from Daniela
    @FindBy(xpath = "(//span[@class='innernametext'])[59]")
    public WebElement deletedFileFinal;

    //from Daniela
    private static String fileNameH;
    public static String getFileNameHolder() {
        return fileNameH;
    }
    public static void setFileNameHolder(String fileNameHolder) {
        fileNameHolder=Driver.getDriver().findElement(By.xpath("(//span[@class='innernametext'])[2]")).getText();
        fileNameH = fileNameHolder;
    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllFiles;

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
