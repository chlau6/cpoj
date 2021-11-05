package question;

import annotation.Array;
import annotation.HashTable;
import annotation.Strings;

@Array
@HashTable
@Strings
public class Q1160 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(1)
     */
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        int result = 0;

        for (char c : chars.toCharArray()) {
            counts[c - 'a']++;
        }

        for (String word : words) {
            int[] a = counts.clone();
            int length = word.length();
            int i;

            for (i = 0; i < length; i++) {
                if (--a[word.charAt(i) - 'a'] < 0) {
                    break;
                }
            }

            if (i == length) {
                result += length;
            }
        }

        return result;
    }
}

/*
1160. Find Words That Can Be Formed by Characters
 */
