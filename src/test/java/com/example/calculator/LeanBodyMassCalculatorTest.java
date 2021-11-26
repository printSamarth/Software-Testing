package com.example.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class LeanBodyMassCalculatorTest {

    LeanBodyMassCalculator leanBodyMassCalculator = new LeanBodyMassCalculator();
    @Test
    public void calcBodyMass() {
        assertEquals(57.41499999999999,leanBodyMassCalculator.calcBodyMass('N', 'M', 165, 80));
        assertEquals(-1D,leanBodyMassCalculator.calcBodyMass('N', 'M', -1, -80));
        assertEquals(0.0215D,leanBodyMassCalculator.calcBodyMass('Y', 'M', 1, 1));
    }

    @Test
    public void calculate() {
        assertEquals("Invalid inputs", leanBodyMassCalculator.calculate('N', 'F', -1, 90));
        assertEquals("Lean Body Mass0.50458979147759", leanBodyMassCalculator.calculate('Y', 'F', 10, 10));
    }
}
