package question;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q295 {
    /*
    Time Complexity: O(n log n) Space Complexity: O(n)
     */
    class MedianFinder {
        Queue<Integer> lowerHalf;
        Queue<Integer> upperHalf;
        boolean even = true;

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
            upperHalf = new PriorityQueue<>();
        }

        /*
        Time Complexity: O(log n)   Space Complexity: O(n)
         */
        public void addNum(int num) {
            if (even) {
                upperHalf.add(num);
                lowerHalf.add(upperHalf.poll());
            } else {
                lowerHalf.add(num);
                upperHalf.add(lowerHalf.poll());
            }

            even = !even;
        }

        /*
        Time Complexity: O(1)   Space Complexity: O(1)
         */
        public double findMedian() {
            return even ? (lowerHalf.peek() + upperHalf.peek()) / 2.0 : lowerHalf.peek();
        }
    }
}

/*
295. Find Median from Data Stream
 */
