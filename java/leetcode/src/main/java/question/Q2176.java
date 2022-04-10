package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2176 {
    public int countPairs(int[] nums, int k) {
        /*
        Hashing
         */
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], key -> new ArrayList<>()).add(i);
        }

        for (List<Integer> list : map.values()) {
            int l = list.size();

            for (int i = 0; i < l - 1; i++) {
                for (int j = i + 1; j < l; j++) {
                    if (list.get(i) * list.get(j) % k == 0) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    public int countPairs2(int[] nums, int k) {
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}

/*
2176. Count Equal and Divisible Pairs in an Array
 */
