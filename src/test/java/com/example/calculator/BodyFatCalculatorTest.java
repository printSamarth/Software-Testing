package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BodyFatCalculatorTest {

    @Test
    public void calculate() {
        BodyFatCalculator bodyFatCalculator = new BodyFatCalculator();
        String res;

        res=bodyFatCalculator.calculate( 'm', Double.valueOf(0),Double.valueOf(0),Double.valueOf(0),Double.valueOf(0), Double.valueOf(0));
        assertEquals("Invalid Inputs", res);

        res=bodyFatCalculator.calculate( 'f', Double.valueOf(0),Double.valueOf(0),Double.valueOf(0),Double.valueOf(0), Double.valueOf(0));
        assertEquals("Invalid Inputs", res);

        res=bodyFatCalculator.calculate('m',55,1.65, 0.3,0.7, 0.8);
        assertEquals("Invalid Inputs", res);
        
        res=bodyFatCalculator.calculate('m',70,1.75,1,-1,70);
        assertEquals("Invalid Inputs", res);
        
        res=bodyFatCalculator.calculate('m',68,-10,5,Double.valueOf(0),70);
        assertEquals("Invalid Inputs", res);
        
        res=bodyFatCalculator.calculate('m',-0.75,1.75,Double.valueOf(0),Double.valueOf(0),70);
        assertEquals("Invalid Inputs", res);

        res=bodyFatCalculator.calculate('m',Double.valueOf(0),Double.valueOf(0),-1,Double.valueOf(0),70);
        assertEquals("Invalid Inputs", res);

//        res=bodyFatCalculator.calculate('m',1,1,1,1,70);
//        assertEquals("Invalid Inputs", res);
        
        res=bodyFatCalculator.calculate('m',55,170,28,60,70);
        assertEquals("Invalid Inputs", res);
        
//        res=bodyFatCalculator.calculate('m'70,170,30,70,70);
//        assertNotEquals("Invalid Inputs", res);
        
        res=bodyFatCalculator.calculate('m',65,158,28,70,70);
        assertNotEquals("Invalid Inputs", res);
        
        res=bodyFatCalculator.calculate('m',65,158,28,80,70);
        assertEquals("Invalid Inputs", res);
        
        res=bodyFatCalculator.calculate('m', 65,158,28,90,70);
        assertNotEquals("Invalid Inputs", res);
    }
}