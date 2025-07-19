package com.arun;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax for the ArrayList:
//        ArrayList<Integer> RefName = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(65);
//        list.add(55);
//        list.add(25);
//        list.add(39);
//        list.add(85);

//        System.out.println(" Original - " + list);

//         if this passed, no. is available in the array list then it gives true or false:
//        System.out.println(list.contains(25));

//        To change the value in array list:
//        list.set(0, 80);
//        System.out.println(list);

//        to remove the value in array list:
//        list.remove(2);
//        System.out.println(list);

//        Take input:

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index:
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));
        }
//        System.out.println(list);
    }
}

