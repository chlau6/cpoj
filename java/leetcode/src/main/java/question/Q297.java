package question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q297 {
    class MedianFinder {
        PriorityQueue<Integer> upper = new PriorityQueue<>();
        PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
        boolean isEven = true;

        public MedianFinder() {

        }

        public void addNum(int num) {
            if (isEven) {
                upper.add(num);
                lower.add(upper.remove());
            } else {
                lower.add(num);
                upper.add(lower.remove());
            }

            isEven = !isEven;
        }

        public double findMedian() {
            if (isEven) {
                return (upper.peek() + lower.peek()) / 2.0;
            } else {
                return lower.peek();
            }
        }
    }
}

/*
297. Serialize and Deserialize Binary Tree
 */
