package question;

public class Q1446 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int maxPower(String s) {
        int result = 1;
        int localMax = 1;
        int length = s.length();

        for (int i = 1; i < length; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                localMax++;
                result = Math.max(result, localMax);
            } else {
                localMax = 1;
            }
        }

        return result;
    }
}

/*
1446. Consecutive Characters
 */
