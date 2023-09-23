package Functions_or_sayMETHODS;

public class FuncOverloading11 {
    public static void main(String[] args) {
        //two or more functions with same name can exist but with different parameters
        fun(2);
        fun("Akshat");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
