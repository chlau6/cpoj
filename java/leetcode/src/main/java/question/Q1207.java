package question;

import annotation.Array;
import annotation.HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Array
@HashTable
public class Q1207 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.size() == new HashSet<>(map.values()).size();
    }
}

/*
1207. Unique Number of Occurrences
 */
