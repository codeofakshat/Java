package Functions_or_sayMETHODS;

import java.util.Scanner;

public class SumwithFunctions1 {
    public static void main(String[] args) {
        /*
        basic syntax for function/method:

        Access modifier return_type name(arguments) {
            //body
            return statement;
        }
        */

        //called sum function
        sum();


    }
    //create sum function
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
