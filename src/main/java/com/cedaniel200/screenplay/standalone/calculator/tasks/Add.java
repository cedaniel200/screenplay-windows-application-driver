package com.cedaniel200.screenplay.standalone.calculator.tasks;

import com.cedaniel200.screenplay.standalone.calculator.model.NumberToOperate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.Iterator;

import static com.cedaniel200.screenplay.standalone.calculator.userinterfaces.CalculatorPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add implements Task {

    private Iterator<Integer> numbers;

    public Add(NumberToOperate numbersToOperate) {
        numbers = numbersToOperate.getNumbers().iterator();
    }

    public static Add add(NumberToOperate numbersToOperate) {
        return instrumented(Add.class, numbersToOperate);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (numbers.hasNext()) {
            String number = numbers.next().toString();
            actor.attemptsTo(
                    Click.on(NUMERIC_BUTTON.of(number)),
                    Check.whether(numbers.hasNext()).andIfSo(Click.on(ADD_BUTTON))
            );
        }
        actor.attemptsTo(Click.on(EQUAL_BUTTON));
    }
}
