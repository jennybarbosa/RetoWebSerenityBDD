package com.herokuapp.theinternet.test.pageobjects;

import com.google.common.base.Predicate;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@DefaultUrl("https://the-internet.herokuapp.com/")
public class FileDownloadPageObject extends PageObject {
    //LOCALIZADORES
    //Link File Download
    By lnkFileDownload = By.xpath("//a[text()='File Download']");
    //Link Item Cinco
    By lnkItemFive = By.xpath("//*[contains(@href,'download')][5]");

    //Getters
    public By getLnkFileDownload() {
        return lnkFileDownload;
    }

    public By getLnkItemFive() {
        return lnkItemFive;
    }
}
