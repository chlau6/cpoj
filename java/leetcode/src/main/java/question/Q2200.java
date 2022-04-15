package question;

import java.util.ArrayList;
import java.util.List;

public class Q2200 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int pointer = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != key) continue;

            int from = Math.max(pointer, i - k);
            int to = Math.min(n - 1, i + k);

            for (int j = from; j <= to; j++) {
                result.add(j);
            }

            pointer = to + 1;
        }

        return result;
    }
}

/*
2200. Find All K-Distant Indices in an Array
 */
