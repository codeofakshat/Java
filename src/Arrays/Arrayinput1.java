package Arrays;

import java.util.Scanner;

public class Arrayinput1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Input 5 elements for array: ");
        int i =0;
        while (i < arr.length) {
            arr[i] = in.nextInt();
            i++;
        }

        //while loop is better here but for loop could also be used
        /*

        for (int i=0; i < arr.length ; i++){
            system.out.print(arr[i] + " ");
         }

        */
        for (int j : arr) //for every element in the array, print the element
        {
            System.out.println(j + " "); //here j represents the element of array
        }


        //above is enhanced for loop
        //base of it was:
        /*

        for (int i=0; i < arr.length ; i++){
            system.out.print(arr[i] + " ");
         }

        */

    }
}
