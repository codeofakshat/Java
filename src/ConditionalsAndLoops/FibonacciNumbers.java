package ConditionalsAndLoops;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //Fibonacci numbers = 0,1,1,2,3,5,8,13,21,.....
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int previous = 0; //first number
        int current = 1; //second number
        int count = 2;
        while (count <= n) {
            int temp = current;
            current = current + previous;
            previous = temp;
            count++;
        }
        System.out.println(current);

    }
}
