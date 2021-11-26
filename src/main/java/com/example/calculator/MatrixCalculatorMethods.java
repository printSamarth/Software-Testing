package com.example.calculator;

public class MatrixCalculatorMethods {
    public int[][] matrixAddition(int [][] a, int [][] b, int m, int n)
    {
        int [][] c= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public int[][] matrixSubtraction(int [][] a, int [][] b, int m, int n)
    {
        int [][] c= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public int[][] matrixMultiplication(int [][] a, int [][] b, int m1, int n1, int m2, int n2)
    {
        int [][] c= new int[m1][n2];
        for(int i = 0; i < m1; i++)
        {
            for (int j = 0; j < n2; j++)
            {
                for (int k = 0; k < m2; k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public int[][] matrixTranspose(int [][]a, int m, int n)
    {
        int [][]c=new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[j][i]=a[i][j];
            }
        }
        return c;
    }
}
