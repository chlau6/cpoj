package question;

import java.util.*;

public class Q472 {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>(Arrays.asList(words));

        for (String word : words) {
            int n = word.length();
            if (n == 0) continue;

            boolean[] dp = new boolean[n + 1];
            dp[0] = true;

            for (int i = 0; i < n; i++) {
                if (!dp[i]) continue;

                for (int j = i + 1; j <= n; j++) {
                    if (j - i < n && set.contains(word.substring(i, j))) {
                        dp[j] = true;
                    }
                }

                if (dp[n]) {
                    result.add(word);
                    break;
                }
            }
        }

        return result;
    }
}

/*
472. Concatenated Words
 */
