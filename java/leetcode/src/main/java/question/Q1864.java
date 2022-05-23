package question;

public class Q1864 {
    public int minSwaps(String s) {
        int n = s.length();
        int ones = 0;
        int zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
            } else {
                ones++;
            }
        }

        if (Math.abs(zeros - ones) > 1) return -1;

        if (ones > zeros) {
            return helper(s, '1');
        } else if (ones < zeros) {
            return helper(s, '0');
        } else {
            return Math.min(helper(s, '1'), helper(s, '0'));
        }
    }

    public int helper(String s, char ch) {
        int moves = 0;

        for (char c : s.toCharArray()) {
            if (c != ch) {
                moves++;
            }

            ch ^= 1;
        }

        return moves / 2;
    }
}
/*
1864. Minimum Number of Swaps to Make the Binary String Alternating
 */
