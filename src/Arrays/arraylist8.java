package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i<5; i++){
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0 ; i<5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
