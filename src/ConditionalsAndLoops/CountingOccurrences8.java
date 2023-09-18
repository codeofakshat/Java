package ConditionalsAndLoops;

import java.util.Scanner;

public class CountingOccurrences8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Which number do you want to search? ");
        int j = in.nextInt();
        int count = 0;
        while (n > 0){
            int rem = n % 10;

            if (rem == j){
                count++;
            }
            n=n/10;
        }
        System.out.println("The number " + j + " occurred " + count + " times in the number");
    }
}
