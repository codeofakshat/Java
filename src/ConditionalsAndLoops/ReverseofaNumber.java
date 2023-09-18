package ConditionalsAndLoops;

import java.util.Scanner;

public class ReverseofaNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int reversenum=0;
        while (n!=0){
            int digit = n%10;
            reversenum = reversenum*10 + digit;
            n = n/10;
        }
        System.out.println("The reverse of the number is: "+reversenum);
    }
}
