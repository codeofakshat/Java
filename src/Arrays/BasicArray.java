package Arrays;

public class BasicArray {
    public static void main(String[] args) {
        //syntax
        /*
        datatype[] variable_name = new datatype[size];
        */
        //store 5 roll numbers
        /*int[] rollnos = new int[5];
        //or store directly
        int[] rnos = {23,12,45,32,15};*/

        int[] ros; //declaration of array, ros is getting defined in the stack
        ros =  new int[5]; //initialisation: actually here object is being created in the memory (heap)
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);


    }
}
