package Functions_or_sayMETHODS;

import java.util.Arrays;

public class MultipleVarArguments10 {
    public static void main(String[] args) {
        multiple(2,3,"Akshat", "Saini");

    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
