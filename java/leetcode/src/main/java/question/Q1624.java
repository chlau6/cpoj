package question;

import annotation.HashTable;
import annotation.Strings;

@HashTable
@Strings
public class Q1624 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] pos = new int[26];
        int n = s.length();
        int result = -1;

        for (int i = 0; i < n; i++) {
            int j = s.charAt(i) - 'a';

            if (pos[j] == 0) {
                pos[j] = i + 1;
            } else {
                result = Math.max(result, i - pos[j]);
            }
        }

        return result;
    }
}

/*
1624. Largest Substring Between Two Equal Characters
 */
