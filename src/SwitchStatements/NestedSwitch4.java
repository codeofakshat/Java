package SwitchStatements;

import java.util.Scanner;

public class NestedSwitch4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Akshat Saini");
                break;
            case 2:
                System.out.println("Jai Purohit");
                break;
            case 3:
                System.out.println("Employee number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Has no department");
                } break;
            default:
                System.out.println("Enter correct EmpID");
                break;
                //Give input specifically '3' then 'IT' in next line after Enter
        }
    }
}
