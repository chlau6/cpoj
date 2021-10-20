package question;

import annotation.HashTable;
import annotation.Strings;

@HashTable
@Strings
public class Q205 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean isIsomorphic(String s, String t) {
        int[] chars1 = new int[256];
        int[] chars2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (chars1[c1] != chars2[c2]) {
                return false;
            }
            chars1[c1] = i + 1;
            chars2[c2] = i + 1;
        }

        return true;
    }
}

/*
205. Isomorphic Strings
 */
