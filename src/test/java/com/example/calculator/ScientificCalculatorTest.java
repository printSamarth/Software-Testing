package com.example.calculator;

import junit.framework.TestCase;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ScientificCalculatorTest {
    CalculatorMethods g = new CalculatorMethods();

    @Test
    public void testaddition()
    {
        assertEquals(18.0F,g.addition(7,11));
    }

    @Test
    public void testadd()
    {
        assertEquals(-1F,g.addition(-1,0));
    }

    @Test
    public void testadd1()
    {
        assertEquals(13.1F,g.addition((float)5.6,(float)7.5));
    }

    @Test
    public void testsubtraction()
    {
        assertEquals(1.0F,g.subtraction(10,9));
    }

    @Test
    public void testsub1()
    {
        assertEquals(2.2F,g.subtraction((float)5.5,(float)3.3));
    }

    @Test
    public void testmultiply()
    {
        assertEquals(42.0F,g.multiply(6,7));
    }

    @Test
    public void testmul1()
    {
        assertEquals(6.6000004F,g.multiply(1.1F,6.0F));
    }

    @Test
    public void testdivision()
    {
        assertEquals(5.0F,g.division(20,4));
    }

    @Test
    public void testdiv1()
    {
        assertEquals(3.0F,g.division((float)7.5,(float)2.5));
    }
    @Test
    public void testmodulo()
    {
        assertEquals(3.0F,g.modulo(7,4));
    }
    @Test
    public void testsquare_it()
    {
        assertEquals(40.960003F,g.square_it((float) 6.4));
    }
    @Test
    public void testsquare1()
    {
        assertEquals(25F,g.square_it(5));
    }

    @Test
    public void testcube_it()
    {
        assertEquals(32.768F,g.cube_it((float) 3.2));
    }
    @Test
    public void testcube1()
    {
        assertEquals(64F,g.cube_it(4));
    }
    @Test
    public void testsquare_root_it()
    {
        assertEquals(3.0983868F,g.square_root_it((float) 9.6));
    }
    @Test
    public void testcube_root_it()
    {
        assertEquals(2.125317F,g.cube_root_it((float) 9.6));
    }
    @Test
    public void testfactorial_of_it()
    {
        assertEquals(120,g.factorial_of_it(5));
    }
    @Test
    public void testfactorial1()
    {
        assertEquals(24,g.factorial_of_it(4));
    }
    @Test
    public void testinverse_of_it()
    {
        assertEquals(0.04F,g.inverse_of_it(25));
    }
    @Test
    public void testpower_base_10()
    {
        assertEquals(100,g.power_base_10(2));
    }
    @Test
    public void testpower10_1()
    {
        assertEquals(100000,g.power_base_10(5));
    }
    @Test
    public void testexponent_of()
    {
        assertEquals(20.085537F,g.exponent_of(3));
    }
    @Test
    public void testpermutations_of()
    {
        assertEquals(12,g.permutations_of(4,2));
    }
    @Test
    public void testcombinations_of()
    {
        assertEquals(6,g.combinations_of(4,2));
    }
    @Test
    public void testsolve_equations()
    {

        assertEquals((float)-0.5,g.solve_equations(2, 3, 1));
    }
    @Test
    public void testrad_to_degree()
    {
        assertEquals(57.32484F,g.rad_to_degree(1));
    }
    @Test
    public void testdegree_to_rad()
    {
        assertEquals(3.14F,g.degree_to_rad(180));
    }
    @Test
    public void testtrigo_sin()
    {
        assertEquals(0.8509035F,g.trigo_sin(45));
    }
    @Test
    public void testtrigo_cosin()
    {
        assertEquals(0.52532196F,g.trigo_cosin(45));
    }
    @Test
    public void testtrigo_tan()
    {
        assertEquals(1.6197752F,g.trigo_tan(45));
    }
    @Test
    public void testdec_to_hex()
    {
        assertEquals("A",g.dec_to_hex(10));
    }
    @Test
    public void testhex_to_dec()
    {
        assertEquals(229,g.hex_to_dec("E5"));
    }
    @Test
    public void testbin_to_dec()
    {
        assertEquals(4,g.bin_to_dec(4));
    }
    @Test
    public void testoct_to_dec()
    {
        assertEquals(31,g.oct_to_dec(37));
    }
    @Test
    public void testbin_to_hex()
    {
        assertEquals("44D",g.bin_to_hex(1101));
    }
    @Test
    public void testoct_to_bin()
    {
        assertEquals(110111,g.oct_to_bin(67));
    }

    @Test
    public void testoct_to_hex()
    {
        assertEquals("11",g.oct_to_hex(17));
    }
}



