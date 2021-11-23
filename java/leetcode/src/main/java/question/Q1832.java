package question;

import annotation.HashTable;
import annotation.Strings;

@HashTable
@Strings
public class Q1832 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean checkIfPangram(String sentence) {
        int[] counts = new int[26];
        int count = 0;
        int n = sentence.length();

        for (int i = 0; i < n; i++) {
            int c = sentence.charAt(i) - 'a';

            if (++counts[c] == 1) {
                count++;
            }

            if (count == 26) return true;
        }

        return false;
    }
}

/*
1832. Check if the Sentence Is Pangram
 */
