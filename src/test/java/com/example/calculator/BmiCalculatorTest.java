package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmiCalculatorTest {

    @Test
    public void calculate() {
        BmiCalculator bmiCalculator=new BmiCalculator();
        String res;

        res=bmiCalculator.calculate(0, 0);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1.2, 0);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(0, 10);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(-1, -2);
        assertEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(2, 40);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(2, 80);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1.5, 60);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1.5, 90);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1, 18.5);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1, 25);
        assertNotEquals("Invalid Inputs", res);

        res=bmiCalculator.calculate(1, 30);
        assertNotEquals("Invalid Inputs", res);

    }
//    @Test
//    public void calculateBmi()
//    {
//        Double res= BmiCalculator.calculateBmi(-1, -1);
//        assertEquals( Double.valueOf(-1), res);
//    }
}