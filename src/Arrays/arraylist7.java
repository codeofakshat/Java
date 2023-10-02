package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        //array list is used when you don't know the total size you'll require
        // kinda like dynamic allocation
        list.add(56);
        list.add(5346);
        list.add(3245);
        list.add(34);
        list.add(4526);
        list.add(542);
        list.add(34);
        list.add(426);
        list.add(52456);
        list.add(647);
        list.add(5658);
        list.add(3457);
        list.add(5245);
        list.add(865);
        list.add(479);
        //as many as you want
        System.out.println(list);
        System.out.println(list.contains(865)); //gives true
        list.set(0, 99); //set or replace oth index to 99
        System.out.println(list);
        list.remove(3); //remove index 3
        System.out.println(list);


    }
}
