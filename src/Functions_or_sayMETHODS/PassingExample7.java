package Functions_or_sayMETHODS;

public class PassingExample7 {
    public static void main(String[] args) {
        String name = "Akshat Saini";
        greet(name);
    }

    static void greet(String naam) {
        System.out.println(naam);
        //both are pointing to different value so does not swap
    }
}
