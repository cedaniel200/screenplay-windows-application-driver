package com.cedaniel200.screenplay.standalone.calculator.model;

import java.util.List;

public class NumberToOperate {

    private List<Integer> numbers;

    public NumberToOperate(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}