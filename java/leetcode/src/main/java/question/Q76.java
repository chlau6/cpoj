package question;

import annotation.HashTable;
import annotation.SlidingWindow;
import annotation.Strings;
import company.Facebook;

@HashTable
@Strings
@SlidingWindow
@Facebook
public class Q76 {
    public static void main(String[] args) {
        System.out.println(new Q76().minWindow("ADOBECODEBANC", "ABC"));
    }

    /*
    Time Complexity: O(m + n)   Space Complexity: O(n)
     */
    public String minWindow(String s, String t) {
        int[] chars = new int[128];
        int left = 0;
        int count = 0;
        int minLeft = -1;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            chars[c]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (--chars[c] >= 0) {
                count++;
            }
            while (count == t.length()) {
                if (i - left + 1 < minLen) {
                    minLen = i - left + 1;
                    minLeft = left;
                }
                if (++chars[s.charAt(left)] > 0) {
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
