package Functions_or_sayMETHODS;

public class ReturnString3 {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String greeting = "how are you?";
        return greeting;
    }
}
