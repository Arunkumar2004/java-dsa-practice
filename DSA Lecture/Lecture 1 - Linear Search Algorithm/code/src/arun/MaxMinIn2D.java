package arun;

import java.util.Arrays;
public class MaxMinIn2D {
    public static void main (String[] args) {

        int[][] arr = {
                {23, 4, 65},
                {22, 54, 95, 65},
                {3, 34, 67}
        };
        int target = 5764;
        int ans = maxi (arr);
        System.out.println(ans);
    }

    static int maxi(int[][] arr) {
        int max = Integer.MIN_VALUE;
        if(arr.length == 0) {
            return Integer.MIN_VALUE;
        }
//        for(int row = 0; row < arr.length; row++)
        for (int[] ints : arr) { // Enhanced for loop:
            for (int col = 0; col < ints.length; col++) {

                int element = ints[col];
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
//        return Integer.MAX_VALUE;
    }
}