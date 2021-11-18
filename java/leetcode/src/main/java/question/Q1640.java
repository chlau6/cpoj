package question;

import annotation.Array;
import annotation.HashTable;

import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
public class Q1640 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        int i = 0;
        int n = arr.length;

        while (i < n) {
            if (!map.containsKey(arr[i])) return false;

            int[] piece = map.get(arr[i]);

            for (int num : piece) {
                if (num != arr[i]) return false;

                i++;
            }
        }

        return true;
    }
}

/*
1640. Check Array Formation Through Concatenation
 */
