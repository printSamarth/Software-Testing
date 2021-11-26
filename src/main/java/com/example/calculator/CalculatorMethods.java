package com.example.calculator;

import java.util.ArrayList;

public class CalculatorMethods {
    public float addition(float a,float b)
    {
        return a+b;
    }

    /* subtract two numbers */
    public float subtraction(float a,float b)
    {
        return a-b;
    }

    /* multiply two numbers */
    public float multiply(float a,float b)
    {
        return a*b;
    }

    /* divide two numbers */
    public float division(float a,float b)
    {
        if(b==0)
        {
            System.err.println("Error: cannot divide a number with zero.");
            return (float) 0.0;
        }
        return a/b;

    }

    /* find n1 modulo n2 */
    public float modulo(int a,int b)
    {
        return a%b;
    }

    /* square of number */
    public float square_it(float x)
    {
        return (float)x*x;
    }

    /* cube of number */
    public float cube_it(float x)
    {
        return (float)x*x*x;
    }

    /* find square root of number */
    public float square_root_it(float x)
    {
        return (float)Math.sqrt(x);
    }

    /* find cube root of number */
    public float cube_root_it(float x)
    {
        return (float)Math.cbrt(x);
    }

    /* find factorial of number */
    public int factorial_of_it(int x)
    {
        int i=1,ans=1;
        while(i<=x)
        {
            ans=ans*i;
            i=i+1;
        }
        return ans;
    }

    /* find inverse of number */
    public float inverse_of_it(int x)
    {
        if(x==0)
        {
            System.err.println("Error: Cannot find inverse 0.");
            return (float) 0.0;
        }
        else
        {
            return (float)1/x;
        }

    }

    /* find 10th power of number */
    public int power_base_10(int x)
    {
        int ans=1;
        int i;
        for(i=0;i<x;i++)
        {
            ans=ans*10;
        }
        return ans;
    }

    /* find exponentiation of number */
    public float exponent_of(int x)
    {
        return (float) Math.exp(x);
    }

    /* evaluate nPr */
    public int permutations_of(int n, int r)
    {
        int diff=n-r,c=1,fact_1=1,fact_2=1;
        while(c<=n)
        {
            fact_1=fact_1*c;
            c=c+1;
        }
        c=1;
        while(c<=diff)
        {
            fact_2=fact_2*c;
            c=c+1;
        }
        return fact_1/fact_2;
    }

    /* evaluate nCr */
    public int combinations_of(int n, int r)
    {
        int diff=n-r,c=1,fact_1=1,fact_2=1,fact_3=1;
        while(c<=n)
        {
            fact_1=fact_1*c;
            c=c+1;
        }
        c=1;
        while(c<=diff)
        {
            fact_2=fact_2*c;
            c=c+1;
        }
        c=1;
        while(c<=r)
        {
            fact_3=fact_3*c;
            c=c+1;

        }
        return fact_1/(fact_2*fact_3);
    }

    /* solve given quadratic equation for x */
    public float solve_equations(int a, int b, int c)
    {
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        int	d = b * b - 4 * a * c;
        float root1=(float) 0.0, root2=(float) 0.0;
        if(d > 0)

        {

            System.out.println("Roots are real and unequal");

            root1 = (float) (( - b + Math.sqrt(d))/(2*a));

            root2 = (float) ((-b - Math.sqrt(d))/(2*a));

            System.out.println("First root is:"+root1);

            System.out.println("Second root is:"+root2);

        }

        else if(d == 0)

        {

            System.out.println("Roots are real and equal");

            root1 = (float) ((-b+Math.sqrt(d))/(2*a));

            System.out.println("Root:"+root1);

        }

        else

        {

            System.out.println("Roots are imaginary");

        }

        return root1;

    }


    /* convert angle in radian to angle in degree */
    public float rad_to_degree(int x)
    {
        return (float)((x*180)/3.14);
    }


    /* convert angle in degree to angle in angle */
    public float degree_to_rad(int deg)
    {
        return (float)(deg * 3.14)/180;
    }


    /* find sine of an angle */
    public float trigo_sin(int x)
    {
        return (float)Math.sin(x);

    }

    /* find cosine of an angle */
    public float trigo_cosin(int x)
    {
        return (float)Math.cos(x);
    }

    /* find tangent of an angle */
    public float trigo_tan(int x)
    {
        return (float)Math.tan(x);
    }

    /* convert given decimal number to hexadecimal number */
    public String dec_to_hex(int x)
    {
        String ans="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(x>0)
        {
            ans=hex[x%16]+ans;
            x=x/16;
        }
        return ans;
    }


    /* convert given hexadecimal number to decimal number */
    public int hex_to_dec(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for(int i = 0; s.length()>i; i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }


    /* convert given binary number to decimal number */
    public int bin_to_dec(int n)
    {
        int dec =0, p = 0;
        while(n!=0)
        {
            dec += ((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
        return dec;

    }

    /* convert given binary number to decimal number */
    public ArrayList<Integer> dec_to_bin(int n)
    {

        ArrayList<Integer> binary = new ArrayList<Integer>();
        int index = 0;
        while(n > 0)
        {
            binary.add(n%2);
            n = n/2;
        }
        return binary;
    }

    public ArrayList<Integer> dec_to_octal(int n)
    {
        ArrayList<Integer> octalNum = new ArrayList<Integer>();

        // counter for octal number array
        int i = 0;
        while (n != 0) {

            // Storing remainder in octal array
            octalNum.add(n % 8);
            n = n / 8;
            i++;
        }
        return octalNum;
    }

    /* convert given octal number to decimal number */
    public int oct_to_dec(int n)
    {
        int oct;
        int d=0;
        int i = 0;
        int orig;
        oct = n;
        orig = oct;
        while(oct != 0)
        {
            d = d + (oct%10)*(int)Math.pow(8, i);
            i++;
            oct = oct/10;
        }
        return d;
    }

    /* convert given binary number to hexadecimal number */
    public String bin_to_hex(int d)
    {
        int binnum, rem;
        String hexdecnum="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        binnum=d;
        while(binnum>0)
        {
            rem = binnum%16;
            hexdecnum = hex[rem] + hexdecnum;
            binnum = binnum/16;
        }
        return hexdecnum;
    }


    /* convert given octal number to binary number */
    public int oct_to_bin(int d)
    {
        int decimalNumber = 0, i = 0;
        int binaryNumber = 0;
        int octalNumber = d;
        while(octalNumber != 0)
        {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber/=10;
        }

        i = 1;

        while (decimalNumber != 0)
        {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }

        return binaryNumber;
    }


    /* convert given octal number to hexadecimal number */
    public String oct_to_hex(int q)
    {
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexdec="";
        while(q != 0)
        {
            rem=q%16;
            hexdec= a[rem] + hexdec;
            q= q/16;
        }
        return hexdec;
    }

    // add two 3-d matrices
    public int[][] matrixAddition(int [][] a, int [][] b)
    {
        int [][] c= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }


    // subtract two 3-d matrices
    public int[][] matrixSubtraction(int [][] a, int [][] b)
    {
        int [][] c= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }


    // multiply two 3-d matrices
    public int[][] matrixMultiplication(int [][] a, int [][] b)
    {
        int [][] c= new int[3][3];
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
