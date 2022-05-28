package question;

import java.util.HashMap;
import java.util.Map;

public class Q1218 {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int num : arr) {
            int last = map.getOrDefault(num - difference, 0);

            result = Math.max(result, last + 1);

            map.put(num, last + 1);
        }

        return result;
    }
}

/*
1218. Longest Arithmetic Subsequence of Given Difference
 */
