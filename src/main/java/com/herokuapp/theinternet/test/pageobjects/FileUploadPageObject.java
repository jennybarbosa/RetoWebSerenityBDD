package com.herokuapp.theinternet.test.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://the-internet.herokuapp.com/")
public class FileUploadPageObject extends PageObject {
    //LOCALIZADORES

    //Link File Upload
    By lnkFileUpload = By.xpath("//a[text()='File Upload']");
    //Botón Choose File
    By btnChooseFile = By.xpath("//input[@id='file-upload']");
    //Botón Upload
    By btnUpload = By.xpath("//input[@id='file-submit']");
    //Título File Uploaded!
    By lblFileUploaded = By.xpath("//h3[text()='File Uploaded!']");
    //Mensaje de error
    By lblError = By.xpath("//h1[text()='Internal Server Error']");

    //Getters
    public By getLnkFileUpload() {
        return lnkFileUpload;
    }

    public By getBtnChooseFile() {
        return btnChooseFile;
    }

    public By getBtnUpload() {
        return btnUpload;
    }

    public By getLblFileUploaded() {
        return lblFileUploaded;
    }

    public By getLblError() {
        return lblError;
    }
}
