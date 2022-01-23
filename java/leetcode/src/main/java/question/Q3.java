package question;

import java.util.Arrays;

public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int[] pos = new int[128];
        Arrays.fill(pos, -1);

        int n = s.length();
        int start = -1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i);

            start = Math.max(start, pos[c]);
            result = Math.max(result, i - start);
            pos[c] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Q3().lengthOfLongestSubstring("abba"));
    }
}

/*
3. Longest Substring Without Repeating Characters
 */
