package arun;

public class SearchInString {
    public static void main (String[] args) {
        String name = "Arunkumar";
        char target = 'g';
        // Call the
        System.out.println(search2 (name, target));

        //System.out.println (Arrays.toString(name.toCharArray()));
    }

    static boolean search (String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if  (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // using for each loop:

    static boolean search2 (String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (char ch : name.toCharArray()) {
            if (ch == target){
                return true;
            }
        }

        return false;
    }

}
