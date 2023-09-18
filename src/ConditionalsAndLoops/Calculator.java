package ConditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till user does not press X or x
        int answer = 0;

        //infinite while loop
        while (true){
            //input two numbers
            System.out.println("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            //take the operator as input
            System.out.println("Enter the operator between num1 and num2 (+,-,*,/,%) : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op ==  '-' || op == '*' || op == '/' || op == '%'){
                if (op == '+'){
                    answer = num1 + num2;
                }
                if (op == '-'){
                    answer = num1 - num2;
                }
                if (op == '*'){
                    answer = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        answer = num1 / num2;
                    }
                }
                if (op == '%'){
                    answer = num1 % num2;
                }
            } else if (op == 'X' || op =='x') {
                break;
            } else {
                System.out.println("Trying Invalid operation!!");
            }
            System.out.println(answer);
        }

    }
}
