package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmrCalculatorTest {

    @Test
    public void calculate() {
        BmrCalculator bmrCalculator=new BmrCalculator();
        String res;

        res=bmrCalculator.calculate(10,'F',0,0);
        assertEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(10,'m',0,0);
        assertEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(16,'F',1.5,0);
        assertEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(16,'M',-1,1);
        assertEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(85,'M',1.70,70);
        assertEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(30,'F',1.65,55);
        assertNotEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(32,'f',1.70,75);
        assertNotEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(59,'m',1.74,84);
        assertNotEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(62,'F',1.64,70);
        assertNotEquals("Invalid Inputs", res);

        res=bmrCalculator.calculate(26,'f',1.75,68);
        assertNotEquals("Invalid Inputs", res);

    }
}