package com.example.calculator;

//        res=bodyFatCalculator.calculate('m',1,1,1,1,70);
//        assertEquals("Invalid Inputs", res);

import org.junit.Test;

import static org.junit.Assert.*;

public class CalorieCalculatorTest {

    @Test
    public void calculate() {

        CalorieCalculator calorieCalculator = new CalorieCalculator();
        String res;

        res=calorieCalculator.calculate(10,'F',0,0,0);
        assertEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(16,'F',1.5,55,0);
        assertEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(78,'M',1.70,70,1);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(30,'F',1.65,55, 2);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(32,'f',1.70,75,3);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(59,'m',1.74,84,4);
        assertNotEquals("Invalid Inputs", res);

        res=calorieCalculator.calculate(25,'M',1.8,65,5);
        assertEquals("Number of calories to consume everyday: 1028.375", res);

    }
}