package question;

import annotation.Array;
import annotation.Counting;
import annotation.HashTable;

import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
@Counting
public class Q1128 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] d : dominoes) {
            int key = Math.min(d[0], d[1]) * 10 + Math.max(d[0], d[1]);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int result = 0;

        for (int count : map.values()) {
            result += count * (count - 1) / 2;
        }

        return result;
    }
}

/*
1128. Number of Equivalent Domino Pairs
 */
