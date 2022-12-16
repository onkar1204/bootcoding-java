package com.bootcoding.calculator;

import java.util.List;

public class CalculatorService {


    public void process(List<Number> numbers){
        numbers.forEach(number -> {
            add(number);
            sub(number);
            mul(number);
        });

        FileService fs = new FileService();
        fs.writeToFile(numbers);
    }

    private void add(Number number){
        number.getNumbers();
        //TODO logic to add
    }
    private void sub(Number number){
        //TODO logic to sub
    }
    private void mul(Number number){
        //TODO logic to mul
    }
}