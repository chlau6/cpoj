package question;

public class Q1221 {
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
