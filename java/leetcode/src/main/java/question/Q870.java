package question;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int n = nums2.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            pq.add(new int[]{nums2[i], i});
        }

        while (!pq.isEmpty()) {
            int[] top = pq.poll();

            int num = top[0];
            int index = top[1];

            if (num < nums1[right]) {
                result[index] = nums1[right--];
            } else {
                result[index] = nums1[left++];
            }

        }

        return result;
    }
}

/*
870. Advantage Shuffle
 */
