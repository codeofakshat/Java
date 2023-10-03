package Arrays;

import java.util.Arrays;

public class swapquestion1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,23};
        swap(arr, 0, 4);
        //swaps index 0 and index 4
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
