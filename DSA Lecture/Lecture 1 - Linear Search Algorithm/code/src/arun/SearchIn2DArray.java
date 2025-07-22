package arun;

import java.util.Arrays;
public class SearchIn2DArray {
    public static void main (String[] args) {

        int[][] arr = {
                {23, 4, 65},
                {22, 54, 95, 65},
                {3, 34, 67}
        };
        int target = 5764;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}