package question;

import annotation.Array;
import annotation.HashTable;
import annotation.Strings;
import company.Facebook;

@Array
@HashTable
@Strings
@Facebook
public class Q953 {
    /*
    Time Complexity: O(mn)  Space Complexity: O(26)
     */
    public boolean isAlienSorted(String[] words, String order) {
        int[] orders = new int[26];

        for (int i = 0; i < 26; i++) {
            orders[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (notPass(words[i], words[i + 1], orders)) {
                return false;
            }
        }

        return true;
    }

    private boolean notPass(String s1, String s2, int[] orders) {
        int l1 = s1.length();
        int l2 = s2.length();

        for (int i = 0; i < l1 && i < l2; i++) {
            int c1 = s1.charAt(i) - 'a';
            int c2 = s2.charAt(i) - 'a';
            if (c1 != c2) {
                return orders[c1] > orders[c2];
            }
        }
        return l1 > l2;
    }
}

/*
953. Verifying an Alien Dictionary
 */
