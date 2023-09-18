package SwitchStatements;

import java.util.Scanner;

public class WeekdayorWeekend3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Day of week (Monday/Tuesday/Wednesday/Thursday...) : ");
//        int day = in.nextInt();
        String day = in.nextLine();


        /*switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;

        }*/
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Please enter a valid week day");
                break;
        }
//ENHANCED SWITCH CASE FOR THE SAME, see how much better it looks
        /*
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Please enter a valid week day");
        }
        */
    }
}
