package question;

import annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@HashTable
@Strings
@DynamicProgramming
@Trie
@Memoization
public class Q139 {
    /*
    Time Complexity: O(n^2) Space Complexity: O(n)
     */

    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        Set<String> set = new HashSet<>(wordDict);

        for (int i = 1; i < len + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Q139().wordBreak("leetcode", List.of("leet", "code")));
    }
}

/*
139. Word Break
 */
