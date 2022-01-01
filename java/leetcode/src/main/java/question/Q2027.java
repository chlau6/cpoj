package question;

public class Q2027 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int minimumMoves(String s) {
        int i = 0;
        int n = s.length();
        int result = 0;

        while (i < n) {
            if (s.charAt(i) == 'O') {
                i++;
            } else {
                i += 3;
                result++;
            }
        }

        return result;
    }
}
/*
2027. Minimum Moves to Convert String
 */
