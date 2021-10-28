
package question;

import annotation.*;

import java.util.PriorityQueue;
import java.util.Queue;

@Tree
@Design
@BinarySearchTree
@Heap
@BinaryTree
@DataStream
public class Q703 {
    /*
    constructor:    Time Complexity: O(n log n) Space Complexity: O(1)
    add:            Time Complexity: O(log n)   Space Complexity: O(1)
     */
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
