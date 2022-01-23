package question;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q295 {
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

        public double findMedian() {
            return even ? (lowerHalf.peek() + upperHalf.peek()) / 2.0 : lowerHalf.peek();
        }
    }
}

/*
295. Find Median from Data Stream
 */
