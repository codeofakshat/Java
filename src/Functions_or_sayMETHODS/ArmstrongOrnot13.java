package Functions_or_sayMETHODS;

import java.util.Scanner;

public class ArmstrongOrnot13 {
    public static void main(String[] args) {
        /*
        Armstrong number is that number whose sum of cube of each individual digit
        equals the number itself for example 153 = (1^3 + 5^3 + 3^3)
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));

        //we can also print every three digit armstrong number like this:
        System.out.println("3 digits armstrong numbers are: ");
        for (int i = 100; i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n >0){
            int rem = n%10;
            n=n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;
    }
}
