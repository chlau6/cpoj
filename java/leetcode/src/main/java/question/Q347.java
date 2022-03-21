package question;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q347 {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (int num : nums) {
            map.compute(num, (key, value) -> value == null ? 1 : value + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}

/*
347. Top K Frequent Elements
 */
