package question;

import annotation.HashTable;
import annotation.SlidingWindow;
import annotation.Strings;

import java.util.Arrays;

@HashTable
@Strings
@SlidingWindow
public class Q3 {
    /*
    Time Complexity: O(n)   Space Complexity: O(128)
     */
    public int lengthOfLongestSubstring(String s) {
        int globalMax = 0;
        int left = -1;

        int[] ascii = new int[128];
        Arrays.fill(ascii, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            left = Math.max(left, ascii[c]);
            ascii[c] = i;

            globalMax = Math.max(i - left, globalMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        System.out.println(new Q3().lengthOfLongestSubstring("abba"));
    }
}

/*
3. Longest Substring Without Repeating Characters
 */
