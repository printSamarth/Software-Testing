package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdealWeightCalculatorTest {

    @Test
    public void calculate() {
        IdealWeightCalculator idealWeightCalculator = new IdealWeightCalculator();
        String res;

        res=idealWeightCalculator.calculate(25,'M',180);
        assertNotEquals("Ideal weight should be 72.6", res);

        res=idealWeightCalculator.calculate(58,'M',165);
        assertNotEquals("Ideal weight should be 61.4", res);

        res=idealWeightCalculator.calculate(10,'F',0);
        assertNotEquals("Invalid Inputs", res);

        res=idealWeightCalculator.calculate(1,'f',60);
        assertNotEquals("Invalid Inputs", res);

        res=idealWeightCalculator.calculate(25,'f',175);
        assertNotEquals("Invalid Inputs", res);

        res=idealWeightCalculator.calculate(85,'m',150);
        assertNotEquals("Invalid Inputs", res);

        res=idealWeightCalculator.calculate(30,'F',164);
        assertNotEquals("Invalid Inputs", res);

    }
}