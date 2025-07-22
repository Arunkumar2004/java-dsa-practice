package arun;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {23, 4, 65},
                {22, 54, 95, 65},
                {3, 34, 67}
        };
        System.out.println(maximumWealth(accounts)) ;

    }

    static int maximumWealth (int [][] accounts) {

        // To iterate each element in a account grid;

        // person = row;
        // account = col;
        int max = Integer.MIN_VALUE;
        for(int[] intR : accounts) {

            int RowTotal = 0;
            for(int intC : intR) {
                RowTotal = RowTotal + intC ;
            }
            // now we have the sum of account of person
            // check with overall max value.
            if(RowTotal > max) {
                max = RowTotal;
            }
        }
        return max;
    }
}
