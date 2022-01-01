package question;

public class Q1221 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int balancedStringSplit(String s) {
        int result = 0;
        int balance = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'L') balance++;
            else balance--;

            if (balance == 0) result++;
        }

        return result;
    }
}

/*
1221. Split a String in Balanced Strings
 */
