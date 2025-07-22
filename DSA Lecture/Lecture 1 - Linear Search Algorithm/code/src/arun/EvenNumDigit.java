package arun;

public class EvenNumDigit {
    public static void main (String[] args) {
        int[] nums = {235, 45, 675, 4565, 8, 54};
        int ans = FindTheNum(nums);
        System.out.println("The number Even digit in a giver numbers is : " + ans);
        System.out.println(digit(-757560));
    }

    // Now count the numbers is an even digit or not :
    static int FindTheNum (int[] nums) {
        int count = 0;
//        for(int i = 0; i < nums.length) {
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }


    // now return the num is odd or even:
    static boolean even (int num) {
        if (digit2(num) %2 == 0) {
            return true;
        }
        return false;
    }


    // Method 1: now count the digit :

    static int digit(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }
        int Digit = 0;
        while (num > 0) {
            Digit = Digit + 1;
            num = num / 10;
        }
        return Digit;
    }

    // Method 2 : Count the digit:  By using this method to optimize the program //

    static int digit2 (int num){

        if (num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num) +1);
    }

}
