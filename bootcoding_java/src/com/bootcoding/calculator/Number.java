package com.bootcoding.calculator;

import java.util.List;

public class Number {

    private List<Integer> numbers;
    private int addition;
    private int subtraction;
    private int multiplication;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getAddition() {
        return addition;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(int subtraction) {
        this.subtraction = subtraction;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }
}