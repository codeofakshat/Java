package Basic;

import java.util.Scanner;

public class TypeCasting3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*//typecasting
        int num = (int)(67.56f);
        System.out.println(num);*/

        //automatic type promotion in expressions

        /*int a = 257;
        byte b = (byte)(a);
        System.out.println(b);*/

        //output is 1 because max range of byte var is 256 only but we are giving 257
        // 1 is actually remainder when value you gave (257) divided by max range of byte, i.e. , 256

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) + (d - s);
        System.out.println((f * b)  + " " + (i / c) + " " +  (d - s)); //gives calculation in diff parts
        System.out.println(result); //final answer



        
    }
}
