package question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q2208 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        int result = 0;

        for (double num : nums) {
            pq.add(num);
            sum += num;
        }

        double originalSum = sum;

        while (sum * 2 > originalSum) {
            double half = pq.poll() / 2;
            sum -= half;
            pq.add(half);

            result++;
        }

        return result;
    }
}

/*
2208. Minimum Operations to Halve Array Sum
 */
