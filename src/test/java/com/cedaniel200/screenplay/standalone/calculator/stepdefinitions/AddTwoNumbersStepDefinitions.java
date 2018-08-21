package com.cedaniel200.screenplay.standalone.calculator.stepdefinitions;

import com.cedaniel200.screenplay.standalone.calculator.questions.TheResult;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.cedaniel200.screenplay.standalone.calculator.model.NumberToOperateBuilder.theNumbers;
import static com.cedaniel200.screenplay.standalone.calculator.tasks.Add.add;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

public class AddTwoNumbersStepDefinitions {

    @Managed
    private WebDriver driver;
    private Actor cesar = Actor.named("Cesar");

    @Before
    public void prepareStage() {
        cesar.can(BrowseTheWeb.with(driver));
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void addTwoNumbers(int firstNumber, int secondNumber) throws Exception {
        cesar.attemptsTo(add(theNumbers(firstNumber).and(secondNumber)));
    }

    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int thisNumber) throws Exception {
        cesar.should(seeThat(TheResult.ofTheSum(), is(thisNumber)));
    }

}
