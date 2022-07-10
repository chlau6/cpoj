package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q893 {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();

        for (String w : words) {
            int n = w.length();

            int[] odd = new int[26];
            int[] even = new int[26];

            for (int i = 0; i < n; i++) {
                char c = w.charAt(i);

                if (i % 2 == 0) {
                    even[c - 'a']++;
                } else {
                    odd[c - 'a']++;
                }
            }

            String key = Arrays.toString(odd) + Arrays.toString(even);

            set.add(key);
        }

        return set.size();
    }
}

/*
893. Groups of Special-Equivalent Strings
 */
