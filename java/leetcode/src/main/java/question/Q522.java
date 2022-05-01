package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q522 {
    public int findLUSlength(String[] strs) {
        int result = 0;
        int n = strs.length;
        Set<String> set = new HashSet<>();

        Arrays.sort(strs, (a, b) -> b.length() - a.length());

        for (int i = 0; i < n; i++) {
            if (i == n - 1 || !strs[i].equals(strs[i + 1])) {
                boolean found = true;

                for (String s : set) {
                    int j = 0;
                    int len = strs[i].length();

                    for (char c : s.toCharArray()) {
                        if (c == strs[i].charAt(j)) j++;
                        if (j == len) break;
                    }

                    if (j == len) {
                        found = false;
                        break;
                    }
                }

                if (found) return strs[i].length();
            }

            set.add(strs[i]);
        }

        return -1;
    }
}

/*
522. Longest Uncommon Subsequence II
 */
