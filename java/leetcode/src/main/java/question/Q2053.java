package question;

import annotation.Array;
import annotation.Counting;
import annotation.HashTable;
import annotation.Strings;

import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
@Strings
@Counting
public class Q2053 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : arr) {
            if (map.get(s) == 1 && --k == 0) {
                return s;
            }
        }

        return "";
    }
}
/*
2053. Kth Distinct String in an Array
 */
