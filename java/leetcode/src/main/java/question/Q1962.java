package question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1962 {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int result = 0;

        for (int pile : piles) {
            pq.add(pile);
        }

        while (--k >= 0) {
            int p = pq.poll();
            pq.add(p - p / 2);
        }

        for (int p : pq) {
            result += p;
        }

        return result;
    }
}
/*
1962. Remove Stones to Minimize the Total
 */
