package question;

import java.util.HashSet;
import java.util.Set;

public class Q1461 {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        char[] string = s.toCharArray();
        int num = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            num = (num << 1) + string[i] - '0';

            if (i >= k - 1) {
                set.add(num);
                num -= (string[i - k + 1] - '0') << (k - 1);
            }
        }

        return (1 << k) == set.size();
    }
}

/*
1461. Check If a String Contains All Binary Codes of Size K
 */
