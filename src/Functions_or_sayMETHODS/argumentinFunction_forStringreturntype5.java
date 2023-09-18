package Functions_or_sayMETHODS;

public class argumentinFunction_forStringreturntype5 {
    public static void main(String[] args) {
        String personalised = myGreet("Akshat Saini");
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "Hello "+ name;
        return message;
    }
}
