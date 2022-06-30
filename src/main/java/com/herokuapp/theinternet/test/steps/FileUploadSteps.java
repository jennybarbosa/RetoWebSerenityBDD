package com.herokuapp.theinternet.test.steps;

import com.herokuapp.theinternet.test.exceptions.ErrorServerException;
import com.herokuapp.theinternet.test.pageobjects.FileUploadPageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUploadSteps {

    //Objeto de la clase FileUploadPageObject
    FileUploadPageObject uploadPO  = new FileUploadPageObject();
    //Path absoluto desde C: hasta el proyecto
    Path root = FileSystems.getDefault().getPath("").toAbsolutePath();
    //Path absoluto hasta el archivo txt
    Path fileTxtPath = Paths.get(root.toString(), "src", "main", "resources", "uploads", "TestFile.txt");
    //Path absoluto hasta el archivo png
    Path filePngPath = Paths.get(root.toString(), "src", "main", "resources", "uploads", "TestImage.png");

    //Método para abrir el navegador
    @Step
    public void openBrowser(){
    uploadPO.open();
    }
    //Método para ir al link File Upload
    @Step
    public void goToFileUpload (){
    uploadPO.getDriver().findElement(uploadPO.getLnkFileUpload()).click();
    }
    //Método para seleccionar el archivo txt de la carpeta uploads del proyecto
    @Step
    public void selectTxtFile (){
        WebDriverWait wait = new WebDriverWait(uploadPO.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(uploadPO.getBtnChooseFile())).sendKeys(fileTxtPath.toString());
    }
    //Método para dar click en el botón Upload
    @Step
    public void fileUpload(){
        uploadPO.getDriver().findElement(uploadPO.getBtnUpload()).click();
    }

    //Método para realizar el assert del texto File Uploaded!
    @Step
    public void validateMessage(String message){
        try{String text = uploadPO.getDriver().findElement(uploadPO.getLblFileUploaded()).getText();
            Assert.assertTrue(text, message.equals(text ));
        }catch  (Exception e){
            //La excepción se implementa cuando el elemento lblError sea mostrado en la página
            if (uploadPO.getDriver().findElement(uploadPO.getLblError()).isDisplayed())
                throw new ErrorServerException(ErrorServerException.ERROR_SERVER);
        }
        String text = uploadPO.getDriver().findElement(uploadPO.getLblFileUploaded()).getText();
        Assert.assertTrue(text, message.equals(text ));
    }
    //Método para regresar al inicio
    @Step
    public void goBackFileUpload(){
        uploadPO.getDriver().navigate().back();
    }
    //Método para seleccionar el archivo png de la carpeta uploads
    public void selectPngFile(){
        WebDriverWait wait = new WebDriverWait(uploadPO.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(uploadPO.getBtnChooseFile())).sendKeys(filePngPath.toString());

    }
}
