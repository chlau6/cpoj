package question;

import java.util.PriorityQueue;

public class Q2164 {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> odd = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> even = new PriorityQueue<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = (i % 2 == 0) ? even.poll() : odd.poll();
        }

        return result;
    }
}

/*
2164. Sort Even and Odd Indices Independently
 */
