package question;

public class Q696 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int countBinarySubstrings(String s) {
        int result = 0;
        int prev = 0;
        int curr = 1;
        int length = s.length();

        for (int i = 1; i < length; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                prev = curr;
                curr = 1;
            }

            if (prev >= curr) result++;
        }

        return result;
    }
}

/*
696. Count Binary Substrings
 */
