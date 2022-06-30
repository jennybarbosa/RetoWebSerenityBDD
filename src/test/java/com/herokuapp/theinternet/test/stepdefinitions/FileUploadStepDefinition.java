package com.herokuapp.theinternet.test.stepdefinitions;

import com.herokuapp.theinternet.test.steps.FileUploadSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class FileUploadStepDefinition {
    //Instancia para llamar los métodos creados en la clase FileUploadSteps
    @Steps
    FileUploadSteps uploadSteps;

    @Given("^that i am in herokuapp$")
    public void thatIAmInHerokuapp() {
    uploadSteps.openBrowser();
    }

    @When("^I upload a txt file$")
    public void iUploadATxtFile() {
    uploadSteps.goToFileUpload();
    uploadSteps.selectTxtFile();
    uploadSteps.fileUpload();
    }

    @When("^I validate message \"([^\"]*)\" for txt file$")
    public void iValidateMessageForTxtFile(String message) {
    uploadSteps.validateMessage(message);
    }

    @When("^I upload a png file$")
    public void iUploadAPngFile() {
    uploadSteps.goBackFileUpload();
    uploadSteps.selectPngFile();
    uploadSteps.fileUpload();
    }

    @Then("^I validate message \"([^\"]*)\" for png file$")
    public void iValidateMessageForPngFile(String message) {
    uploadSteps.validateMessage(message);
    }
}