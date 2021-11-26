package com.example.calculator;

import java.util.Scanner;

public class MatrixCalculator {
        public static void driver(){
            int choice = getChoice();
            MatrixCalculatorMethods matrixCalculatorMethods = new MatrixCalculatorMethods();
            Scanner sc = new Scanner(System.in);
            while(choice != 5){
                switch (choice){
                    case 1:
                        System.out.println("Enter size of matrices:");
                        int m = sc.nextInt();
                        int n = sc.nextInt();
                        int x[][]=new int[m][n];
                        int y[][]=new int[m][n];

                        System.out.println("Enter first matrix:");
                        for(int i=0;i<m;i++)
                        {
                            for(int j=0;j<n;j++)
                            {
                                x[i][j]=sc.nextInt();
                            }
                        }
                        System.out.println("Enter second matrix: ");
                        for(int i=0;i<m;i++)
                        {
                            for(int j=0;j<n;j++)
                            {
                                y[i][j]=sc.nextInt();
                            }
                        }
                        int z[][] = matrixCalculatorMethods.matrixAddition(x, y, m, n);
                        System.out.println("Result is:");
                        for(int i=0;i<m;i++)
                        {
                            System.out.println();
                            for(int j=0;j<n;j++)
                            {
                                System.out.print(z[i][j] + " ");
                            }
                        }
                        break;
                    case 2:

                        System.out.println("Enter size of matrices:");
                        int m1 = sc.nextInt();
                        int n1 = sc.nextInt();
                        int x1[][]=new int[m1][n1];
                        int y1[][]=new int[m1][n1];
                        System.out.println("Enter first matrix:");
                        for(int i=0;i<m1;i++)
                        {
                            for(int j=0;j<n1;j++)
                            {
                                x1[i][j]=sc.nextInt();
                            }
                        }
                        System.out.println("Enter second matrix: ");
                        for(int i=0;i<m1;i++)
                        {
                            for(int j=0;j<n1;j++)
                            {
                                y1[i][j]=sc.nextInt();
                            }
                        }
                        int z1[][] = matrixCalculatorMethods.matrixSubtraction(x1, y1, m1, n1);
                        System.out.println("Result is:");
                        for(int i=0;i<m1;i++)
                        {
                            System.out.println();
                            for(int j=0;j<n1;j++)
                            {
                                System.out.print(z1[i][j] + " ");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter size of matrices 1:");
                        int m12 = sc.nextInt();
                        int n12 = sc.nextInt();
                        System.out.println("Enter size of matrices 2:");
                        int m22 = sc.nextInt();
                        int n22 = sc.nextInt();

                        int x11[][]=new int[m12][n12];
                        int y11[][]=new int[m12][n12];
                        for(int i=0;i<m12;i++)
                        {
                            for(int j=0;j<n12;j++)
                            {
                                x11[i][j]=sc.nextInt();
                            }
                        }
                        for(int i=0;i<m22;i++)
                        {
                            for(int j=0;j<n22;j++)
                            {
                                y11[i][j]=sc.nextInt();
                            }
                        }
                        int z11[][] = matrixCalculatorMethods.matrixMultiplication(x11, y11, m12, n12, m22, n22);
                        System.out.println("Result is:");
                        for(int i=0;i<m12;i++)
                        {
                            System.out.println();
                            for(int j=0;j<n22;j++)
                            {
                                System.out.print(z11[i][j]);
                            }
                        }
                        break;

                    case 4:

                        System.out.println("Enter size of matrices:");
                        int m11 = sc.nextInt();
                        int n11 = sc.nextInt();
                        int x111[][]=new int[m11][n11];
                        int y111[][]=new int[m11][n11];
                        for(int i=0;i<m11;i++)
                        {
                            for(int j=0;j<n11;j++)
                            {
                                x111[i][j]=sc.nextInt();
                            }
                        }
                        int z111[][] =  matrixCalculatorMethods.matrixTranspose(x111, m11, n11);
                        System.out.println("Result is:");
                        for(int i=0;i<m11;i++)
                        {
                            System.out.println();
                            for(int j=0;j<n11;j++)
                            {
                                System.out.print(z111[i][j]);
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Exiting..");
                        break;

                }
                choice = getChoice();
            }
        }
        public static int getChoice() {
            System.out.println("1.Matrix Addition\n"
                    + "2.Matrix subtraction\n"
                    + "3.Matrix multiplication\n"
                    + "4.Matrix transpose\n"
                    + "5.Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            return choice;
        }

}

