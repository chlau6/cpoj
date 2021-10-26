
package question;

import annotation.Counting;
import annotation.HashTable;
import annotation.Strings;

@HashTable
@Strings
@Counting
public class Q383 {
    /*
    Time Complexity: O(n)    Space Complexity: O(n)
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];

        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (--counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}

/*
383. Ransom Note
 */
