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

        res=bmiCalculator.calculate(10, 100);
        assertEquals("Underweight. Your BMI is 1.0", res);

        res=bmiCalculator.calculate(1.65, 65);
        assertEquals("Healthy. Your BMI is 23.875114784205696", res);

        res=bmiCalculator.calculate(1.7, 80);
        assertEquals("Overweight. Your BMI is 27.68166089965398", res);

        res=bmiCalculator.calculate(1.8, 110);
        assertEquals("Obese. Your BMI is 33.95061728395061", res);

    }
//    @Test
//    public void calculateBmi()
//    {
//        Double res= BmiCalculator.calculateBmi(-1, -1);
//        assertEquals( Double.valueOf(-1), res);
//    }
}