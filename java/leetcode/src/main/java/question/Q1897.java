package question;

import annotation.Array;
import annotation.Matrix;

@Array
@Matrix
public class Q1897 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(1)
     */
    public boolean makeEqual(String[] words) {
        int[] counts = new int[26];
        int k = words.length;

        for (String word : words) {
            int n = word.length();

            for (int i = 0; i < n; i++) {
                char c = word.charAt(i);
                counts[c - 'a']++;
            }
        }

        for (int count : counts) {
            if (count % k != 0) return false;
        }

        return true;
    }
}

/*
1897. Redistribute Characters to Make All Strings Equal
 */
