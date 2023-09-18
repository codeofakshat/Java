package Basic;

import java.util.Scanner;

public class Inputs1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter some input: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll no is : " + rollno);

        System.out.println("Enter some string");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter some float value");
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
