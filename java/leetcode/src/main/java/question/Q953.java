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
    Time Complexity: O(sum(length(words[i])))  Space Complexity: O(26)
     */
    public boolean isAlienSorted(String[] words, String order) {
        int[] letter = new int[26];

        for (int i = 0; i < order.length(); i++) {
            int code = order.charAt(i) - 'a';
            letter[code] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (notPass(words[i], words[i + 1], letter)) {
                return false;
            }
        }

        return true;
    }

    private boolean notPass(String s1, String s2, int[] letter) {
        int l1 = s1.length();
        int l2 = s2.length();

        for (int j = 0; j < l1 && j < l2; j++) {
            int c1 = s1.charAt(j) - 'a';
            int c2 = s2.charAt(j) - 'a';
            if (c1 != c2) {
                return letter[c1] > letter[c2];
            }
        }
        return l1 > l2;
    }
}

/*
953. Verifying an Alien Dictionary
 */
