package question;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q703 {
    class KthLargest {
        Queue<Integer> pq = new PriorityQueue<>();
        int k;

        public KthLargest(int k, int[] nums) {
            for (int num : nums) {
                pq.add(num);
                if (pq.size() > k) pq.poll();
            }

            this.k = k;
        }

        public int add(int val) {
            pq.add(val);

            if (pq.size() > k) pq.poll();

            return pq.peek();
        }
    }
}

/*
703. Kth Largest Element in a Stream
 */
