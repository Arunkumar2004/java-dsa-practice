package com.arun;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    //----------------------------------------------------------------------------------------------------//
        // Array of primitives

//        int arr[] = new int[5];

//        arr[0] = 3;
//        arr[1] = 4;
//        arr[2] = 23;
//        arr[3] = 45;
//        arr[4] = 36;
//      [3, 4, 23, 45, 36]



//        for (int i = 0 ; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        // 1. printing method.

//        System.out.println(Arrays.toString(arr));

        // 2. printing method

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 3. printing method

//        for (int num: arr) { // here num represent element of an array.
//           System.out.print(num + " "); // for every element in array,  print the element.
//        }
//        System.out.println(arr[5]); // Index 5 out of bounds for  length 5.

     //------------------------------------------------------------------------------------------------------//

        // Array of Objects:

        String str[] = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        // 1 . method to print
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }

        // 2.  method to print

        System.out.println(Arrays.toString(str));

        // modify
        str[2] = "arun";
        System.out.println(Arrays.toString(str));




    }
}
