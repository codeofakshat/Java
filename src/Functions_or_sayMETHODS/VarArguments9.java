package Functions_or_sayMETHODS;

import java.util.Arrays;

public class VarArguments9 {
    public static void main(String[] args) {
        fun(2,3,54,23,345,23,45,32,3,65,6);

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
        //basically array with variable, or indefinite inputs, you don't know initially how many inputs you'll give
    }
}
