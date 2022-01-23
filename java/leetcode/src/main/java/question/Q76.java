package question;

public class Q76 {
    public static void main(String[] args) {
        System.out.println(new Q76().minWindow("ADOBECODEBANC", "ABC"));
    }

    public String minWindow(String s, String t) {
        int[] letters = new int[128];

        int m = s.length();
        int n = t.length();

        int count = 0;
        int left = 0;
        int minLeft = -1;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            letters[t.charAt(i)]++;
        }

        for (int i = 0; i < m; i++) {
            if (--letters[s.charAt(i)] >= 0) {
                count++;
            }

            while (count == n) {
                if (i - left + 1 < minLen) {
                    minLen = i - left + 1;
                    minLeft = left;
                }

                if (++letters[s.charAt(left)] > 0) {
                    count--;
                }

                left++;
            }
        }

        return minLeft == -1 ? "" : s.substring(minLeft, minLeft + minLen);
    }
}

/*
76. Minimum Window Substring
 */
