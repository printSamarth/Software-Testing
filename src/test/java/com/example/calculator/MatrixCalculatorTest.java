package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
public class MatrixCalculatorTest {

    MatrixCalculatorMethods matrixCalculatorMethods = new MatrixCalculatorMethods();
    @Test
    public void matrixAdditionTest(){
        int matrix[][] = {{1, 2, 3}, {1, 2, 3}};
        int expected[][] = {{2, 4, 6}, {2, 4, 6}};
        int res[][] = matrixCalculatorMethods.matrixAddition(matrix, matrix, 2, 3);
        assertEquals(expected, res);
    }

    @Test
    public void matrixSubtractionTest(){
        int matrix[][] = {{1, 2, 3}, {1, 2, 3}};
        int expected[][] = {{0, 0, 0}, {0, 0, 0}};
        int res[][] = matrixCalculatorMethods.matrixSubtraction(matrix, matrix, 2, 3);
        assertEquals(expected, res);
    }
    @Test
    public void matrixMultiplicationTest(){
        int matrix1[][] = {{1, 2, 3}, {1, 2, 3}};
        int matrix2[][] = {{1, 2}, {1, 3}, {2, 3}};
        int expected[][] = {{9, 17}, {9, 17}};
        int res[][] = matrixCalculatorMethods.matrixMultiplication(matrix1, matrix2, 2, 3, 3, 2);
        assertEquals(expected, res);
    }



}
