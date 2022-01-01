package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1002 {
    /*
    Time Complexity: O(mn) Space Complexity: O(m)
     */
    public List<String> commonChars(String[] words) {
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);

        for (String word : words) {
            int[] a = new int[26];

            for (char c : word.toCharArray()) {
                a[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                count[i] = Math.min(count[i], a[i]);
            }
        }

        List<String> result = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            while (--count[i - 'a'] >= 0) {
                result.add("" + i);
            }
        }

        return result;
    }
}

/*
1002. Find Common Characters
 */
