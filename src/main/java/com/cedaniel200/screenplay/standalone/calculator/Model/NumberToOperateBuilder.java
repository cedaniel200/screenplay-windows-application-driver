package com.cedaniel200.screenplay.standalone.calculator.Model;

import java.util.ArrayList;
import java.util.List;

public class NumberToOperateBuilder implements Builder<NumberToOperate> {

    private List<Integer> numbers;

    public NumberToOperateBuilder(int number) {
        numbers = new ArrayList<>();
        numbers.add(number);
    }

    public static NumberToOperateBuilder theNumbers(int number){
        return new NumberToOperateBuilder(number);
    }

    public NumberToOperateBuilder with(int number){
        numbers.add(number);
        return this;
    }

    public NumberToOperate and(int number){
        numbers.add(number);
        return build();
    }

    @Override
    public NumberToOperate build() {
        return new NumberToOperate(numbers);
    }
}
