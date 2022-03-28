
package question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Q373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] + a[1])));
        int n = Math.min(nums1.length, k);
        int m = nums2.length;

        for (int i = 0; i < n; i++) {
            pq.add(new int[]{nums1[i], nums2[0], 0});
        }

        while (--k >= 0 && !pq.isEmpty()) {
            int[] root = pq.poll();

            result.add(List.of(root[0], root[1]));

            if (root[2] == m - 1) continue;
            pq.offer(new int[]{root[0], nums2[root[2] + 1], root[2] + 1});
        }

        return result;
    }
}

/*
373. Find K Pairs with Smallest Sums
 */
