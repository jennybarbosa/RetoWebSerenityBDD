package com.herokuapp.theinternet.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src\\test\\resources\\com.herokuapp.theinternet.test.features\\FileUpload.feature"},
glue = "com.herokuapp.theinternet.test.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class FileUploadRunner {

}
