package question;

import java.util.HashSet;
import java.util.Set;

public class Q1805 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        int i = 0;
        char[] w = word.toCharArray();
        int n = w.length;

        while (i < n) {
            while (i < n && Character.isAlphabetic(w[i])) i++;

            int start = i;
            while (i < n && Character.isDigit(w[i])) i++;

            if (i - start > 0) {
                while (i - start > 1 && w[start] == '0') start++;
                set.add(word.substring(start, i));
            }
        }

        return set.size();
    }
}

/*
1805. Number of Different Integers in a String
 */
