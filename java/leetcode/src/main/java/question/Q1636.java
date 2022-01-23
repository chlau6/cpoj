package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1636 {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            list.add(num);
        }

        list.sort((a, b) -> {
            if (map.get(a).equals(map.get(b))) return a - b;
            return map.get(a) - map.get(b);
        });

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

/*
1636. Sort Array by Increasing Frequency
 */
