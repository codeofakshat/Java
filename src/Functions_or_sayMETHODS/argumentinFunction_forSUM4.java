package Functions_or_sayMETHODS;

public class argumentinFunction_forSUM4 {
    public static void main(String[] args) {
        // we had
        /*

        basic syntax for function/method:

        Access modifier return_type name(arguments) {
            //body
            return statement;

        */

        //here we are going to discus argument in above syntax

        /*
        here lets say you don't want to use scanner again and again and just pass the values when calling
        function itself
        */

        int answer = sum3(20, 30);
        System.out.println(answer);
    }

    //pass the values of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
