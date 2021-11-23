package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class ScientificCalculator {
    /* add two numbers */

    public void scientificDriver() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opening scientific calculator...");
        System.out.println("Which operation do you want to perform?");
        System.out.println("1.Addition \n"
                + "2.Subtraction\n"
                + "3.Multiplication\n"
                + "4.Division\n"
                + "5.Mod\n"
                + "6.Square\n"
                + "7.Cube\n"
                + "8.SquareRoot\n"
                + "9.CubeRoot\n"
                + "10.Factorial\n"
                + "11.Inverse\n"
                + "12.Power10\n"
                + "13.Exponent\n"
                + "14.Permutation\n"
                + "15.Combination\n"
                + "16.Radian to Degree\n"
                + "17.Degree to Radian\n"
                + "18.Sine\n"
                + "19.Cosine\n"
                + "20.Tan\n"
                + "21.Hexadecimal to Decimal\n"
                + "22.Binary to Decimal\n"
                + "23.Octal to Decimal\n"
                + "24.Binary to Octal\n"
                + "25.Binary to Hexadecimal\n"
                + "26.Solve Quadratic equation\n"
                + "27.Decimal to hexadecimal\n"
                + "28.Decimal to binary\n"
                + "29.Decimal to octal\n"
                + "30.Octal to binary\n"
                + "31.Octal to hexadecimal\n"
                + "32.Hexadecimal to binary\n"
                + "33.Hexadecimal to octal\n"
        );
        int ch = sc.nextInt();
        CalculatorMethods g = new CalculatorMethods();
        float a;
        float b;
        float res;
        int a1;
        int b1;
        int r;
        int n[];
        String str;
        switch (ch) {

            case 1:
                System.out.println("Enter two inputs");
                a = sc.nextFloat();
                b = sc.nextFloat();
                res = g.addition(a, b);
                System.out.println("Result= " + res);
                break;

            case 2:
                System.out.println("Enter two inputs");
                a = sc.nextFloat();
                b = sc.nextFloat();
                res = g.subtraction(a, b);
                //res = a-b;
                System.out.println("Result= " + res);
                break;

            case 3:
                System.out.println("Enter two inputs");
                a = sc.nextFloat();
                b = sc.nextFloat();
                res = g.multiply(a, b);
                System.out.println("Result= " + res);
                break;

            case 4:
                System.out.println("Enter two inputs");
                a = sc.nextFloat();
                b = sc.nextFloat();
                res = g.division(a, b);
                //res = g.div(a, b);
                System.out.println("Result= " + res);
                break;

            case 5:
                System.out.println("Enter two inputs");
                a1 = sc.nextInt();
                b1 = sc.nextInt();
                res = g.modulo(a1, b1);
                System.out.println("Result= " + res);
                break;

            case 6:
                System.out.println("Enter input");
                a = sc.nextFloat();
                res = g.square_it(a);
                System.out.println("Result= " + res);
                break;

            case 7:
                System.out.println("Enter input");
                a = sc.nextFloat();
                res = g.cube_it(a);
                System.out.println("Result= " + res);
                break;

            case 8:
                System.out.println("Enter input");
                a = sc.nextFloat();
                res = g.square_root_it(a);
                System.out.println("Result= " + res);
                break;

            case 9:
                System.out.println("Enter input");
                a = sc.nextFloat();
                res = g.cube_root_it(a);
                System.out.println("Result= " + res);
                break;

            case 10:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                r = g.factorial_of_it(a1);
                System.out.println("Result= " + r);
                break;

            case 11:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                res = g.inverse_of_it(a1);
                System.out.println("Result= " + res);
                break;

            case 12:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                r = g.power_base_10(a1);
                System.out.println("Result= " + r);
                break;

            case 13:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                res = g.exponent_of(a1);
                System.out.println("Result= " + res);
                break;

            case 14:
                System.out.println("Enter two inputs");
                a1 = sc.nextInt();
                b1 = sc.nextInt();
                r = g.permutations_of(a1, b1);
                System.out.println("Result= " + r);
                break;

            case 15:
                System.out.println("Enter two inputs");
                a1 = sc.nextInt();
                b1 = sc.nextInt();
                r = g.combinations_of(a1, b1);
                System.out.println("Result= " + r);
                break;

            case 16:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                res = g.rad_to_degree(a1);
                System.out.println("Result= " + res);
                break;

            case 17:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                res = g.degree_to_rad(a1);
                System.out.println("Result= " + res);
                break;

            case 18:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                res = g.trigo_sin(a1);
                System.out.println("Result= " + res);
                break;

            case 19:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                res = g.trigo_cosin(a1);
                System.out.println("Result= " + res);
                break;

            case 20:
                System.out.println("Enter input");
                a1 = sc.nextInt();
                res = g.trigo_tan(a1);
                System.out.println("Result= " + res);
                break;

            case 21:
                System.out.println("Enter Hexadecimal");
                //str = sc.nextLine();
                str = sc.nextLine();
                r = g.hex_to_dec(str);
                System.out.println("Result= " + r);
                break;

            case 22:
                System.out.println("Enter Binary");
                a1 = sc.nextInt();
                r = g.bin_to_dec(a1);
                System.out.println("Result= " + r);
                break;

            case 23:
                System.out.println("Enter Octal");
                a1 = sc.nextInt();
                r = g.oct_to_dec(a1);
                System.out.println("Result= " + r);

                break;

            case 24:
                System.out.println("Enter Binary");
                a1 = sc.nextInt();
                int res1;
                res1 = g.bin_to_dec(a1);
                System.out.println("Result= ");
                System.out.print(res1);
                break;
            case 25:
                System.out.println("Enter Binary");
                a1 = sc.nextInt();
                String res11 = g.bin_to_hex(a1);
                System.out.println("Result= ");
                System.out.print(res11);
                break;

            case 26:
                System.out.println("Enter a,b,c values");
                int a11 = sc.nextInt();
                int b11 = sc.nextInt();
                int c11 = sc.nextInt();
                ArrayList<Float> al = new ArrayList<Float>();
                float f = g.solve_equations(a11, b11, c11);
                System.out.println("Result is: ");
                System.out.println(al);
                break;
//
            case 27:
                System.out.println("Enter decimal:");
                int d = sc.nextInt();
                String result = g.dec_to_hex(d);
                System.out.println("Result is " + result);
                break;

            case 28:
                System.out.println("Enter decimal:");
                int d1 = sc.nextInt();
                ArrayList<Integer> al1 = new ArrayList<Integer>();
                al1 = g.dec_to_bin(d1);
                System.out.println("Result is "+ al1);
                break;

            case 29:
                System.out.println("Enter decimal:");
                int d2 = sc.nextInt();
                ArrayList<Integer> al2 = new ArrayList<Integer>();
                al2 = g.dec_to_octal(d2);

                for (int i = al2.size() - 1; i >= 0; i--) {
                    System.out.print(al2.get(i));
                }
                break;

            case 30:
                System.out.println("Enter Octal number");
                int d3 = sc.nextInt();
                int r1 = g.oct_to_bin(d3);
                System.out.println("Result is " + r1);
                break;

            case 31:
                System.out.println("Enter octal number");
                int d4 = sc.nextInt();
                int d5 = g.oct_to_dec(d4);
                String result1 = g.oct_to_hex(d5);
                System.out.println("Result is: " + result1);
                break;

            case 32:
                System.out.println("Enter hexadecimal: ");
                sc.nextLine();
                String hex = sc.nextLine();
                int d6 = g.hex_to_dec(hex);
                ArrayList<Integer> al21 = new ArrayList<Integer>();
                al21=g.dec_to_bin(d6);
                System.out.println("Result is: " + al21);
                break;

            case 33:
                System.out.println("Enter hexadecimal");
                sc.nextLine();
                String hex1 = sc.nextLine();
                int d7 = g.hex_to_dec(hex1);
                ArrayList<Integer> al3 = new ArrayList<Integer>();
                al3 = g.dec_to_octal(d7);
                System.out.println("Result is: " + al3);
                break;


            default:
                System.out.println("Wrong choice!!");
        }
    }

}

