package com.cedaniel200.screenplay.standalone.calculator.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CalculatorPage {

    public static final Target NUMERIC_BUTTON = Target.the("button {0}")
            .locatedBy("//*[@AutomationId='num{0}Button']");
    public static final Target ADD_BUTTON = Target.the("add button")
            .locatedBy("//*[@AutomationId='plusButton']");
    public static final Target EQUAL_BUTTON = Target.the("equal button")
            .locatedBy("//*[@AutomationId='equalButton']");
    public static final Target RESULT = Target.the("result")
            .locatedBy("//*[@AutomationId='CalculatorResults']");

}