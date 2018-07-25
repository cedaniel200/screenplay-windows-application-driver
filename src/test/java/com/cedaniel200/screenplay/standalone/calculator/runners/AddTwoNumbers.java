package com.cedaniel200.screenplay.standalone.calculator.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = { "src/test/resources/features/add_two_numbers.feature" },
                    glue = { "com.cedaniel200.screenplay.standalone.calculator.stepdefinitions" },
                    snippets = SnippetType.CAMELCASE)
public class AddTwoNumbers {

}
