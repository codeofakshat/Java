package Functions_or_sayMETHODS;

import java.util.Arrays;

public class ChangeValue8 {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}
//change oth index to 99 because both are pointing to same value