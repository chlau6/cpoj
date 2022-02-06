package question;

import java.util.ArrayList;
import java.util.List;

public class Q131 {
    /*
    DP
     */
    public List<List<String>> partition(String s) {
        int n = s.length();

        List<List<String>> result = new ArrayList<>();
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[j][i] = s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j + 1][i - 1]);
            }
        }

        recursion(result, new ArrayList<>(), dp, s, 0);

        return result;
    }

    public void recursion(List<List<String>> result, List<String> list, boolean[][] dp, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(list));
        }

        for (int i = start; i < s.length(); i++) {
            if (!dp[start][i]) continue;

            list.add(s.substring(start, i + 1));
            recursion(result, list, dp, s, i + 1);
            list.remove(list.size() - 1);
        }
    }

    /*
    Backtracking
     */
    public List<List<String>> partition2(String s) {
        List<List<String>> result = new ArrayList<>();

        recursion(result, new ArrayList<>(), s, 0);

        return result;
    }

    public void recursion(List<List<String>> result, List<String> list, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }

        int n = s.length();

        for (int i = start; i < n; i++) {
            if (!isPalindrome(s, start, i)) continue;

            list.add(s.substring(start, i + 1));
            recursion(result, list, s, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
/*
131. Palindrome Partitioning
 */