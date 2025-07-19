package com.arun;

// Q. Find the largest.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.println(max);

        //____________________________________________//

//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max){
//            max = c;
//        }

        //___________________________________________//

        int max = Math.max( c, Math.max( a, b ));

//        int max = Math.max(100, Math.max(23 , 44));


        System.out.println(max);






    }
}
