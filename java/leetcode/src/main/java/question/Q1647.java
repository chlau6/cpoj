package question;

import java.util.Arrays;

public class Q1647 {
    public int minDeletions(String s) {
        int[] counts = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            counts[c - 'a']++;
        }

        Arrays.sort(counts);
        int expect = counts[25];
        int result = 0;

        for (int i = 25; i >= 0; i--) {
            if (counts[i] == 0) break;

            if (counts[i] > expect) {
                result += (counts[i] - expect);
            } else {
                expect = counts[i];
            }

            if (expect > 0) expect--;
        }

        return result;
    }
}

/*
1647. Minimum Deletions to Make Character Frequencies Unique
 */
