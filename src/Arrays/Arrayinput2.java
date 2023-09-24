package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput2 {
    public static void main(String[] args) {
        //another method to print
        Scanner in = new Scanner(System.in);
        int[] myarray = new int[5];
        System.out.println("Input 5 elements for array: ");
        for (int i = 0; i < myarray.length; i++){
            myarray[i] = in.nextInt();
        }
        //here it is: basically converts array to string using toString() and prints that string
        System.out.println(Arrays.toString(myarray));
    }
}
