package question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1354 {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for (int num : target) {
            pq.add(num);
            sum += num;
        }

        while (true) {
            int num = pq.poll();

            sum -= num;

            if (num == 1 || sum == 1) return true;

            if (num < sum || sum == 0 || num % sum == 0) return false;

            num %= sum;

            sum += num;

            pq.add(num);
        }
    }
}

/*
1354. Construct Target Array With Multiple Sums
 */
