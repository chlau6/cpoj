package question;

public class Q459 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(n)
     */
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();

        for (int i = length / 2; i >= 1; i--) {
            int times = length / i;
            if (length % i == 0 && s.substring(0, i).repeat(times).equals(s)) {
                return true;
            }
        }

        return false;
    }
}

/*
459. Repeated Substring Pattern
 */
