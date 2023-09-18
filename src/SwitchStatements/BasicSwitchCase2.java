package SwitchStatements;

import java.util.Scanner;

public class BasicSwitchCase2 {
    public static void main(String[] args) {
        //here i am showing more optimized code for the last fruits switch case
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of fruit (Mango/Apple/Orange) : ");
        String fruit = in.next();

//Called as enhanced switch statement
        //Select "Switch" on last code and press Alt+Enter on it, you'll see option to make it Enhanced Switch
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Keeps doctor away");
            case "Orange" -> System.out.println("Juice is good");
            default -> System.out.println("Enter valid fruit!");
        }
    }
}
