package question;

import annotation.Array;
import annotation.Strings;
import annotation.TwoPointers;

import java.util.Arrays;

@Array
@TwoPointers
@Strings
public class Q821 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] result = new int[s.length()];
        char[] chars = s.toCharArray();
        Arrays.fill(result, length);

        for (int i = 0; i < length; i++) {
            if (chars[i] == c) {
                result[i] = 0;
            } else if (i > 0) {
                result[i] = result[i - 1] + 1;
            }
        }

        for (int i = length - 2; i >= 0; i--) {
            if (chars[i] != c) {
                result[i] = Math.min(result[i], result[i + 1] + 1);
            }
        }

        return result;
    }
}

/*
821. Shortest Distance to a Character
 */
