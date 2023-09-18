package SwitchStatements;

import java.util.Scanner;

public class BasicSwitchCase1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit (Mango/Apple/Orange): ");
        String fruit = in.next();


        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Keeps doctor away");
                break;
            case "Orange":
                System.out.println("Juice is good");
                break;
            default:
                System.out.println("Enter valid fruit!");
        }
    }
}
