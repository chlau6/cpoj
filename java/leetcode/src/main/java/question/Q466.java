package question;

import java.util.HashMap;
import java.util.Map;

public class Q466 {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        Map<Integer, Integer> kToRepeatCount = new HashMap<>();
        Map<Integer, Integer> nextIndexToK = new HashMap<>();
        kToRepeatCount.put(0, 0);
        nextIndexToK.put(0, 0);

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int m = c1.length;
        int n = c2.length;

        int j = 0;
        int count = 0;

        for (int k = 1; k <= n1; k++) {
            for (int i = 0; i < m; i++) {
                if (c1[i] == c2[j]) {
                    j++;

                    if (j == n) {
                        j = 0;
                        count++;
                    }
                }
            }

            if (nextIndexToK.containsKey(j)) {
                int start = nextIndexToK.get(j);
                int prefixCount = kToRepeatCount.get(start);
                int patternCount = (n1 - start) / (k - start) * (count - prefixCount);
                int suffixCount = kToRepeatCount.get(start + (n1 - start) % (k - start)) - prefixCount;
                return (prefixCount + patternCount + suffixCount) / n2;
            }

            kToRepeatCount.put(k, count);
            nextIndexToK.put(j, k);
        }

        return kToRepeatCount.get(n1) / n2;
    }
}

/*
466. Count The Repetitions
 */
