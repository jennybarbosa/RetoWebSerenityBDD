package com.herokuapp.theinternet.test.steps;


import com.herokuapp.theinternet.test.pageobjects.FileDownloadPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileDownloadSteps {
    //Objeto de la clase FileDownloadPageObject
    FileDownloadPageObject fileDownloadPO = new FileDownloadPageObject();
    //Ruta absoluta del proyecto
    Path root = FileSystems.getDefault().getPath("").toAbsolutePath();
    //Método para abrir el navegador
    @Step
    public void openBrowser() {
        fileDownloadPO.open();
    }
    //Método para dar click en el link File Download
    @Step
    public void goToFileDownload() {
        fileDownloadPO.getDriver().findElement(fileDownloadPO.getLnkFileDownload()).click();
    }
    //Método para dar click en el link del archivo seleccionado
    @Step
    public void clickFile() {
        fileDownloadPO.getDriver().findElement(fileDownloadPO.getLnkItemFive()).click();
    }

    //Método para abrir el archivo descargado en la carpeta downloads del proyecto
    @Step
    public void openFile() throws IOException {
        //Me trae en texto el nombre del archivo
        String fileText = fileDownloadPO.getDriver().findElement(fileDownloadPO.getLnkItemFive()).getText();
        //path del archivo descargado
        Path filePath = Paths.get(root.toString(), "src", "main", "resources", "downloads", fileText);

        //objeto de la clase File, con el path absoluto del archivo
        File file = new File(filePath.toString());
        //objeto de la clase Desktop para usar método abrir archivo
        Desktop desktop = Desktop.getDesktop();

        //si el archivo existe abrirlo
        if (file.exists()) {
            desktop.open(file);
        }
    }
}
