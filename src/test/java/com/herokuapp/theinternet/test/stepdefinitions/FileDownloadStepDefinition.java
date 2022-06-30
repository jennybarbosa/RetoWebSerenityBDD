package com.herokuapp.theinternet.test.stepdefinitions;

import com.herokuapp.theinternet.test.steps.FileDownloadSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class FileDownloadStepDefinition {
    //Instancia para llamar los métodos creados en la clase FileDownloadSteps
    @Steps
    FileDownloadSteps fileDownloadSteps;
    @Given("^that i am on herokuapp$")
    public void thatIAmOnHerokuapp() {
    fileDownloadSteps.openBrowser();

    }

    @When("^I download a file$")
    public void iDownloadAFile() {
        fileDownloadSteps.goToFileDownload();
        fileDownloadSteps.clickFile();
    }

    @Then("^I open the file$")
    public void iOpenTheFile() throws IOException {
    fileDownloadSteps.openFile();
    }


}
