package ConditionalsAndLoops;

import java.util.Scanner;

public class UppercaseorLowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = in.next().trim().charAt(0);
        //there is no such thing as taking a character input, so we are taking string as input, trimming it to index 0
        //which is basically first letter
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
