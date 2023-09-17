package ConditionalsAndLoops;

import java.util.Scanner;

public class Greatest5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int a = input.nextInt();
        System.out.println("Enter num 2: ");
        int b = input.nextInt();
        System.out.println("Enter num 3:");
        int c = input.nextInt();
        //Find the largest of these 3 numbers inputted
        int max = a;
        if(b>max) {
            max = b;
        }
        if (c>max) {
            max = c;
        }
        System.out.println("Greatest of three is: " + max);


        /*
        Optimized code is by using math.max function already in the library
         int max = 0;
         max = Math.max(a,b);

         if (c>max) {
            max = c;
         }
         System.out.println(max);

        */



        /*
        This can be more optimized as following
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
        */
    }
}
