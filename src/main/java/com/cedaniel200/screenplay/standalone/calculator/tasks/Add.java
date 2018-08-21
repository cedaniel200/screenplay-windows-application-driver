package com.cedaniel200.screenplay.standalone.calculator.tasks;

import com.cedaniel200.screenplay.standalone.calculator.model.NumberToOperate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Iterator;

import static com.cedaniel200.screenplay.standalone.calculator.userinterfaces.CalculatorPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Add implements Task{

    private NumberToOperate numbersToOperate;

    public Add(NumberToOperate numbersToOperate) {
        this.numbersToOperate = numbersToOperate;
    }

    public static Add add(NumberToOperate numbersToOperate){
        return instrumented(Add.class, numbersToOperate);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Iterator<Integer> numbers = numbersToOperate.getNumbers().iterator();
        while (numbers.hasNext()){
            actor.attemptsTo( Click.on(NUMERIC_BUTTON.of(Integer.toString(numbers.next()))));
            if(numbers.hasNext()){
                actor.attemptsTo( Click.on(ADD_BUTTON) );
            }
        }
        actor.attemptsTo( Click.on(EQUAL_BUTTON) );
    }
}
