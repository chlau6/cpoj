package question;

import annotation.HashTable;
import annotation.Sorting;
import annotation.Strings;

@HashTable
@Strings
@Sorting
public class Q242 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int[26];
        int length = s.length();

        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (--counts[c - 'a'] < 0) return false;
        }

        return true;
    }
}

/*
242. Valid Anagram
 */