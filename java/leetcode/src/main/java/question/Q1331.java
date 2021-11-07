package question;

import annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Array
@HashTable
@Sorting
public class Q1331 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public int[] arrayRankTransform(int[] arr) {
        int[] a = Arrays.copyOf(arr, arr.length);

        Arrays.sort(a);

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.putIfAbsent(num, map.size() + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}

/*
1331. Rank Transform of an Array
 */
